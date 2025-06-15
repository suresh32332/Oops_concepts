package oops_concept;

public class Student{
    private String name;
    private int id;
    private String email;

    public Student(int id, String name, String email) {
        this.name = name;
        this.id = id;
        this.email = email;

    }

    public void getname(String name) {
        this.name = name;
    }

    public String setName() {
        return name;
    }

    public void getId(int id) {
        this.id = id;
    }

    public int setId() {
        return id;
    }

    public void getEmail(String email) {
        this.email = email;
    }

    public String setEmail() {
        return email;
    }
  @Override
public String toString() {
    return "Student [name=" + name + ", id=" + id + ", email=" + email + "]";
}
  

}
