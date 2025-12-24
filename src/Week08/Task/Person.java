package Week08.Task;

public class Person {

    protected String fullName;
    protected String id;
    protected String email;
    protected String phone;

    public Person(String fullName, String id, String email, String phone) {
        setFullName(fullName);
        setId(id);
        setEmail(email);
        setPhone(phone);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isEmpty()) {
            this.fullName = fullName;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.isEmpty()) {
            this.id = id;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.length() >= 7) {
            this.phone = phone;
        }
    }

    public String getDescription() {
        return "Person: " + fullName + ", ID: " + id;
    }
}

