import java.util.Scanner;

/**
 * Lớp Student mô tả một sinh viên với thông tin cá nhân gồm tên, mã số,
 * nhóm lớp và email.
 * Cung cấp các phương thức khởi tạo, sao chép, và các getter/setter.
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Constructor không tham số.
     * Khởi tạo sinh viên với giá trị mặc định.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor có tham số.
     *
     * @param name  Tên sinh viên
     * @param id    Mã số sinh viên
     * @param email Email sinh viên
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.group = "K62CB";
    }

    /**
     * Constructor sao chép.
     *
     * @param s Đối tượng Student để sao chép
     */
    public Student(Student s) {
        this.name = s.name;
        this.email = s.email;
        this.id = s.id;
        this.group = s.group;
    }

    /**
     * Lấy tên sinh viên.
     *
     * @return Tên sinh viên
     */
    public String getName() {
        return name;
    }

    /**
     * Gán tên cho sinh viên.
     *
     * @param name Tên cần gán
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Lấy mã số sinh viên.
     *
     * @return Mã số sinh viên
     */
    public String getId() {
        return id;
    }

    /**
     * Gán mã số cho sinh viên.
     *
     * @param id Mã số cần gán
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Lấy nhóm lớp của sinh viên.
     *
     * @return Nhóm lớp
     */
    public String getGroup() {
        return group;
    }

    /**
     * Gán nhóm lớp cho sinh viên.
     *
     * @param group Nhóm cần gán
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Lấy email của sinh viên.
     *
     * @return Địa chỉ email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gán email cho sinh viên.
     *
     * @param email Email cần gán
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Trả về thông tin đầy đủ của sinh viên dưới dạng chuỗi.
     *
     * @return Chuỗi thông tin sinh viên
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /**
     * Phương thức main dùng để kiểm tra lớp Student.
     *
     * @param args Đối số dòng lệnh
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.setName("Nguyen Van An");
        s.setId("17020001");
        s.setGroup("K62CC");
        s.setEmail("17020001@vnu.edu.vn");

        System.out.println(s.getInfo());
    }
}
