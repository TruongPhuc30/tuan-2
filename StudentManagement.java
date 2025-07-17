/**
 * Lớp StudentManagement dùng để quản lý danh sách sinh viên.
 * Bao gồm các chức năng thêm, xóa sinh viên, kiểm tra nhóm,
 * và hiển thị danh sách sinh viên theo từng nhóm.
 */
public class StudentManagement {
    private Student[] students = new Student[100];
    private int studentCount = 0;

    /**
     * Thêm một sinh viên mới vào danh sách.
     *
     * @param newStudent Sinh viên cần thêm
     */
    public void addStudent(Student newStudent) {
        if (studentCount < students.length) {
            students[studentCount] = newStudent;
            studentCount++;
        }
    }

    /**
     * Xóa sinh viên khỏi danh sách theo mã số.
     *
     * @param id Mã số sinh viên cần xóa
     */
    public void removeStudent(String id) {
        int index = -1;
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }

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

    /**
     * Kiểm tra xem hai sinh viên có cùng nhóm hay không.
     *
     * @param s1 Sinh viên thứ nhất
     * @param s2 Sinh viên thứ hai
     * @return true nếu cùng nhóm, ngược lại false
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Trả về chuỗi danh sách sinh viên được phân loại theo nhóm.
     *
     * @return Chuỗi chứa danh sách sinh viên theo từng nhóm
     */
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
                        result.append(students[k].getInfo()).append("\n");
                    }
                }
            }
        }

        return result.toString();
    }

    /**
     * Phương thức main để kiểm tra các chức năng quản lý sinh viên.
     *
     * @param args Đối số dòng lệnh
     */
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
