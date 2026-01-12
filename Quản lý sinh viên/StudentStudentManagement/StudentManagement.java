// package target.test_classes;

import java.util.LinkedHashSet;

public class StudentManagement {
    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    Student[] students = new Student[100];
    LinkedHashSet<String> groups = new LinkedHashSet<>();
    private int sizeS = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * add.
     */
    public void addStudent(Student newStudent) {
        if (sizeS < 100) {
            students[sizeS] = newStudent;
            sizeS++;
            groups.add(newStudent.getGroup());
        } else {
            return;
        }
    }

    /**
     * group.
     */
    public String studentsByGroup() {
        // TODO:
        String result = "";
        for (String g : groups) {
            result = result + g + "\n";
            for (Student stu : students) {
                if (stu != null && stu.getGroup().equals(g)) {
                    result = result + stu.getInfo() + "\n";
                }
            }
        }

        return result;
    }

    /**
     * remove.
     */
    public void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < sizeS; i++) {
            if (students[i].getId().equals(id)) {
                String grp = students[i].getGroup();
                
                for (int j = i; j < sizeS - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[sizeS - 1] = null;
                sizeS--;
                
                boolean stillHasGroup = false;
                for (int k = 0; k < sizeS; k++) {
                    if (students[k].getGroup().equals(grp)) {
                        stillHasGroup = true;
                        break;
                    }
                }
                if (!stillHasGroup) {
                    groups.remove(grp);
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
        // StudentManagement mn = new StudentManagement();
        // Student dang = new Student();
        // mn.addStudent(dang);
        // System.out.println(dang.getEmail());
        // mn.removeStudent(dang.getId());
        // System.out.println(mn.sizeS);
    }
}
