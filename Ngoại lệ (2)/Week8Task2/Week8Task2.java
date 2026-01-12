import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Week8Task2 {
    public void nullPointerEx() throws NullPointerException {
        int[] tmp = null;
        int arrLong = tmp.length;
    }

    /**
     * Function.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            // TODO: handle exception
            return "Lỗi Null Pointer";
        }

        return "Không có lỗi";
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] tmp = new int[1];
        tmp[2] = 0;
    }

    /**
     * Function.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            return "Lỗi Array Index Out of Bounds";

        }

        return "Không có lỗi";
    }

    public void arithmeticEx() throws ArithmeticException {
        int tmp = 1 / 0;
    }

    /**
     * Function.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            // TODO: handle exception
            return "Lỗi Arithmetic";
        }

        return "Không có lỗi";
    }

    /**
     * Function.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        File tmp = new File("tmp.txt");
        Scanner input = new Scanner(tmp);
        while (input.hasNext()) {
            int num = input.nextInt();
        }
    
    }

    /**
     * Function.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            return "Lỗi File Not Found";
        }

        return "Không có lỗi";
    }

    public void ioEx() throws IOException {
        Scanner tmp = new Scanner(new File("tmp.txt"));
    }

    /**
     * Function.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            // TODO: handle exception
            return "Lỗi IO";
        }

        return "Không có lỗi";
    }
}
