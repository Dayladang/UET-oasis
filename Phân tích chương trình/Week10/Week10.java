
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week10 {
    /**
     * bla.
     */
    private String packageName = "";
    private List<String> className = new ArrayList<>();
    private List<String> libraryName = new ArrayList<>();
    private List<String> libraryPath = new ArrayList<>();

    /**
     * bla.
     */
    public void updateLibrary(String[] lines) {
        for (String line : lines) {
            String[] subStrings = line.split(" ");
            int index = -1;
            if (subStrings.length > 1 && subStrings[0].equals("import")) {
                index = 1;
                if (subStrings[1].equals("static")) {
                    index = 2;
                }
            }
            if (index != -1) {
                String path = subStrings[index].substring(0, subStrings[index].length() - 1);
                int lastDotIndex = path.lastIndexOf('.');
                String name = "";
                if (lastDotIndex != -1) {
                    name = path.substring(lastDotIndex + 1);
                } else {
                    name = path;
                }
                libraryPath.add(path);
                libraryName.add(name);
            }
        }
    }

    /**
     * bla.
     */
    public void updateClassName(String[] lines) {
        Pattern pattern = 
        Pattern.compile("(public|protected|private)\\s+(class|interface)\\s+(\\w+)");
        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                className.add(matcher.group(3));
            }
        }
    }

    /**
     * bla.
     */
    public String getMethod(String string) {
        int index1 = string.indexOf("(");
        int index2 = string.indexOf(")");
        if (index1 == -1 || index2 == -1) {
            return null;
        }
        while (index1 >= 0 && string.charAt(index1) != ' ') {
            index1--;
        }

        return string.substring(index1 + 1, index2 + 1);
    }

    /**
     * bla.
     */
    public boolean isStaticMethod(String line) {
        if (line.endsWith(";")) {
            return false;
        }
        
        return (line.startsWith("static ") 
             || line.startsWith("public static ") 
             || line.startsWith("private static ") 
             || line.startsWith("protected static ")) 
             && line.contains("(");
    }

    /**
     * bla.
     */
    public String setupMethodName(String functionName) {
        int left = functionName.indexOf("(");
        int right = functionName.indexOf(")");
        if (left == right - 1) {
            return functionName.substring(0, left).concat("()");
        }
        String s1 = functionName.substring(0, left + 1);
        String paramString = functionName.substring(left + 1, right);
        String[] params = paramString.split(",");
        String s2 = "";
        for (String param : params) {
            String trimmedParam = param.trim();
            int spaceIndex = trimmedParam.indexOf(' '); 
            s2 = s2.concat(formingTypeNameString(trimmedParam.substring(0, spaceIndex)) + ",");
            
        }
        s2 = s2.substring(0, s2.length() - 1).concat(")");

        return s1.concat(s2);
    }
    
    /**
     * bla.
     */
    public String formingTypeNameString(String string) {
        String tempString = "";
        String tmp = null;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '.') {
                if (string.charAt(i) == '<') {
                    tmp = formingTypeNameString(string.substring(i + 1, string.length() - 1));
                    break;
                }
                tempString += string.charAt(i);
            }
        }
        String rs = null;
        for (int i = 0; i < libraryName.size(); i++) {

            if (tempString.equals(libraryName.get(i))) {
                rs = libraryPath.get(i);
            }
        }
        if (rs == null) {
            for (String className : className) {
                if (className.equals(tempString)) {
                    rs = packageName + '.' + tempString;
                }
            }
        }
        if (rs == null && tempString.length() > 0
                && Character.isUpperCase(tempString.charAt(0))
                && !tempString.equals("T[]")
                && !tempString.equals("T")) {
            rs = "java.lang." + tempString;
        }
        if (rs == null) {
            rs = tempString;
        }
        if (tmp != null) {
            rs += "<" + tmp + ">";
        }
        String result = "";
        for (int i = 0; i < rs.length(); i++) {
            if (rs.charAt(i) == '{') {
                break;
            }
            result += rs.charAt(i);
        }

        return result;
    }

    /**
     * bla.
     */
    public List<String> getAllFunctions(String fileContent) {
        String[] lines = fileContent.split("\n");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].trim();
        }
        for (int i = 0; i < lines.length - 1; i++) {
            if (lines[i].endsWith("(")) {
                lines[i] += lines[i + 1];
                lines[i + 1] = "";
            }
        }
        updateLibrary(lines);
        updateClassName(lines);
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            if (line[0].equals("package")) {
                this.packageName = line[1].substring(0, line[1].length() - 1);
                break;
            }
        }
        for (String line : lines) {
            line = line.trim();
            if (isStaticMethod(line) == true) {
                String str = getMethod(line);
                if (str.equals(null) || str.contains("randomIntGreaterThan")) {
                    continue;
                }
                if (setupMethodName(str) != null) {
                    res.add(setupMethodName(str));
                }
            }
        }

        return res;
    }
}