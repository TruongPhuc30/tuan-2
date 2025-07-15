import java.util.Scanner;

public class Student {
    private String name;
    private String id;
    private  String group;
    private String email;
    public Student(){
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }
    public Student(String name, String id, String email){
        this.name = name;
        this.email = email;
        this.id = id;
        this.group = "K62CB";
    }
    public Student(Student s){
        this.name = s.name;
        this.email = s.email;
        this.id = s.id;
        this.group = s.group;
    }
    public String getName(){
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public String getId(){
        return id;
    }
    public void setId(String i) {
        id = i;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String g) {
        group = g;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String e) {
        email = e;
    }
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
