import java.util.Scanner;

public class Student {
    private String name;
    private String id;
    private  String group;
    private String email;
    // phương thức khởi tạo không tham số
    public Student(){
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }
    // phương thức khởi tạo có tham số
    public Student(String name, String id, String email){
        this.name = name;
        this.email = email;
        this.id = id;
        this.group = "K62CB";
    }
    // phương thức khởi tạo sao chép
    public Student(Student s){
        this.name = s.name;
        this.email = s.email;
        this.id = s.id;
        this.group = s.group;
    }
    // getter cho thuộc tính name
    public String getName(){
        return name;
    }
    // setter cho thuộc tính name
    public void setName(String n) {
        name = n;
    }
    // getter cho thuộc tính id
    public String getId(){
        return id;
    }
    // setter cho thuộc tính id
    public void setId(String i) {
        id = i;
    }
    // getter cho thuộc tính group
    public String getGroup(){
        return group;
    }
    // setter cho thuộc tính group
    public void setGroup(String g) {
        group = g;
    }
    // getter cho thuộc tính email
    public String getEmail(){
        return email;
    }
    // setter cho thuộc tính email
    public void setEmail(String e) {
        email = e;
    }
    // getter cho thuộc tính info
    public String getInfo(){
        return name + " - " + id + " - " + group + " - " + email ;
    }

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
