public class StudentManagement {
    private Student[] students = new Student[100];
    private int studentCount = 0;

    public void addStudent(Student newStudent) {
        if (studentCount < 100) {
            students[studentCount] = newStudent;
            studentCount++;
        }
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();
        String[] grouped = new String[100];
        int groupCount = 0;

        for (int i = 0; i < studentCount; i++) {
            String currentGroup = students[i].getGroup();
            boolean exists = false;

            for (int j = 0; j < groupCount; j++) {
                if (grouped[j].equals(currentGroup)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                grouped[groupCount] = currentGroup;
                groupCount++;
                result.append(currentGroup).append("\n");
                for (int k = 0; k < studentCount; k++) {
                    if (students[k].getGroup().equals(currentGroup)) {
                        result.append("   ").append(students[k].getInfo()).append("\n");
                    }
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        Student s1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        s1.setGroup("K62CC");
        Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        s2.setGroup("K62CC");
        Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        s3.setGroup("K62CB");
        Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        s4.setGroup("K62CB");
        sm.addStudent(s1);
        sm.addStudent(s2);
        sm.addStudent(s3);
        sm.addStudent(s4);
        System.out.println("Cùng lớp: " + sameGroup(sm.students[0], sm.students[1]));
        System.out.println("\n--- Danh sách sinh viên theo nhóm ---\n" + sm.studentsByGroup());
    }
}
