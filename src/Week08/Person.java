package Week08;

public  class Person {
    private String name;
    protected String lastName;
    String age;
    public String id;


    public Person() {


    }

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 1)
            return;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!Character.isAlphabetic(ch))
                return;
        }

        this.name = name;
    }

    public final void func(){
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Person) {
            ((Person) obj).name.equals(this.name);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hello Person";
    }
}

