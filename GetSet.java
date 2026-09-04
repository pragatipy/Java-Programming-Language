public class GetSet {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("Pragati");
        s1.setAge(21);
        s1.setCollege("IILM");
        s1.setRollno(101);

        s2.setName("Ananya");
        s2.setAge(22);
        s2.setCollege("IILM");
        s2.setRollno(102);

        System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.getCollege() + " " + s1.getRollno());
        System.out.println(s2.getName() + " " + s2.getAge() + " " + s2.getCollege() + " " + s2.getRollno());
    }
}
class Student {
    private String name;
    private int age;
    private String college;
    private int rollno;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for college
    public String getCollege() {
        //WE can put validations whether the college existr or not
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    // Getter and Setter for rollno
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}