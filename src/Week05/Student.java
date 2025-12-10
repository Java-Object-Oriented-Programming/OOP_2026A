package Week05;

public class Student {

     static int COUNT = 0;
     final static int p =4;

    public String name;
    public String id;
    public String lastName;
    public String address;
    public String year;
    public float age;

    public Student() {
        COUNT++;
    }
    public Student(String name, String id, String lastName, String address, String year, float age) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
        this.address = address;
        this.year = year;
        this.age = age;
        COUNT++;
    }

    String getName(){
        Student.test();
        return this.name;
    }
    static void test(){

    }

}
class Test{

}