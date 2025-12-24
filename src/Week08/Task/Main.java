package Week08.Task;

public class Main {

    public static void main(String[] args) {

        DepartmentHead head = new DepartmentHead(
                "Mor Bassan", "D1", "mor@mail.com", "0500000000",
                "Computer Science", 1, 25000,
                "Prof", 0, "100"
        );

        Lecturer barak = new Lecturer(
                "Barak Sharabi", "L1", "barak@mail.com", "0501111111",
                "Computer Science", 10, 15000,
                "Dr", 3, "301"
        );

        Lecturer ofer = new Lecturer(
                "Ofer Sheli", "L2", "ofer@mail.com", "0502222222",
                "Computer Science", 11, 14000,
                "Dr", 1, "302"
        );

        Lecturer shahar = new Lecturer(
                "Shahar Glik", "L3", "shahar@mail.com", "0503333333",
                "Computer Science", 12, 14000,
                "Dr", 1, "303"
        );

        Lecturer shulamit = new Lecturer(
                "Shulamit Talaur", "L4", "shuli@mail.com", "0504444444",
                "Computer Science", 13, 13000,
                "Ms", 1, "304"
        );

        head.addLecturer(barak);
        head.addLecturer(ofer);
        head.addLecturer(shahar);
        head.addLecturer(shulamit);

        Course oop = new Course("Object Oriented Programming", "CS101", 5);
        Course patterns = new Course("Design Patterns", "CS102", 5);
        Course dataStructures = new Course("Data Structures", "CS103", 5);

        Course java = new Course("Java", "CS104", 5);
        Course react = new Course("React", "CS105", 5);
        Course python = new Course("Python", "CS106", 5);

        oop.setLecturer(barak);
        patterns.setLecturer(barak);
        dataStructures.setLecturer(barak);

        java.setLecturer(shulamit);
        react.setLecturer(ofer);
        python.setLecturer(shahar);

        TeachingAssistant shuliTA = new TeachingAssistant(
                "Shulamit Talaur", "TA1", "shuli@mail.com", "0504444444",
                "Computer Science", 20, 6000, 12
        );

        shuliTA.setSupervisor(barak);
        barak.addAssistant(shuliTA);

        Student shira = new Student(
                "Shira", "S1", "shira@mail.com", "0505555555",
                2, "BSc", 85
        );

        Student rotem = new Student(
                "Rotem", "S2", "rotem@mail.com", "0506666666",
                2, "BSc", 88
        );

        Student mishel = new Student(
                "Mishel", "S3", "mishel@mail.com", "0507777777",
                2, "BSc", 90
        );

        Person[] people = {
                head, barak, ofer, shahar, shulamit,
                shuliTA,
                shira, rotem, mishel
        };

        for (Person p : people) {
            System.out.println(p.getDescription());
        }

        System.out.println(oop.getCourseInfo());
        System.out.println(patterns.getCourseInfo());
        System.out.println(dataStructures.getCourseInfo());
        System.out.println(java.getCourseInfo());
        System.out.println(react.getCourseInfo());
        System.out.println(python.getCourseInfo());
    }
}
