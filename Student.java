import java.util.Scanner;

public class Student {
    // Khai báo các thuộc tính riêng (private)
    private String name;
    private String id;
    private String group;
    private String email;

    // 🔹 Constructor không tham số (mặc định)
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    // 🔹 Constructor có tham số
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB"; // Gán mặc định
    }

    // 🔹 Constructor sao chép từ đối tượng khác
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    // 🔹 Getter và Setter cho từng thuộc tính

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 🔹 Phương thức trả về thông tin đầy đủ của sinh viên
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    // 🔹 Hàm main để kiểm thử class Student
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
