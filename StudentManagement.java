public class StudentManagement {
    private Student[] students = new Student[100];
    private int studentCount = 0;

    // Thêm một sinh viên vào danh sách
    public void addStudent(Student newStudent) {
        if (studentCount < students.length) {
            students[studentCount] = newStudent;
            studentCount++;
        }
    }

    // Xóa sinh viên theo mã số
    public void removeStudent(String id) {
        int index = -1;

        // Tìm vị trí của sinh viên có mã phù hợp
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }

        // Nếu tìm thấy thì xóa và dịch chuyển các phần tử sau
        if (index != -1) {
            for (int j = index; j < studentCount - 1; j++) {
                students[j] = students[j + 1];
            }
            students[studentCount - 1] = null;
            studentCount--;
            System.out.println("Đã xóa sinh viên có mã số: " + id);
        } else {
            System.out.println("Không tìm thấy sinh viên với mã số: " + id);
        }
    }

    // Kiểm tra hai sinh viên có cùng nhóm không
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    // In danh sách sinh viên theo nhóm
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();
        String[] groups = new String[100];
        int groupCount = 0;

        for (int i = 0; i < studentCount; i++) {
            String currentGroup = students[i].getGroup();
            boolean isGrouped = false;

            for (int j = 0; j < groupCount; j++) {
                if (groups[j].equals(currentGroup)) {
                    isGrouped = true;
                    break;
                }
            }

            if (!isGrouped) {
                groups[groupCount] = currentGroup;
                groupCount++;

                result.append(currentGroup).append("\n");
                for (int k = 0; k < studentCount; k++) {
                    if (students[k].getGroup().equals(currentGroup)) {
                        result.append(students[k].getInfo()).append("\n");
                    }
                }
            }
        }

        return result.toString();
    }

    // Hàm main: điểm khởi đầu của chương trình
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

        System.out.println("Cùng lớp: " + StudentManagement.sameGroup(sm.students[0], sm.students[1]));
        System.out.println("\n--- Danh sách sinh viên theo nhóm ---");
        System.out.println(sm.studentsByGroup());
    }
}
