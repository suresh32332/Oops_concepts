
package oops_concept;

public class Main {
    public static void main(String args[]) {
        System.out.println("Student Mangemant System");
        // Object creation
        GraduateStudent student = new GraduateStudent(1, "Student Name ", "Student Email Id ", "Student Degree");
        student.showDetails();
        // using the polymorphism
        Teacher teacher = new TeacherPerson("Teacher Name");
        teacher.show();
    }
}

// create class and Encapsulation
class Student {
    private String name;
    private int id;
    private String email;

    public Student(int id, String name, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public void showDetails() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
    }
}

// Inheritance
class GraduateStudent extends Student {
    private String degree;

    public GraduateStudent(int id, String name, String email, String degree) {
        super(id, name, email);
        this.degree = degree;
    }

    // polymorphism -- method overrideng
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Degree : " + degree);
    }
}

// Abstraction
abstract class Teacher {
    String name;

    abstract void show();
}

class TeacherPerson extends Teacher {
    public TeacherPerson(String name) {
        this.name = name;
    }

    @Override
    void show() {
        System.out.println("Teacher Name : " + name);
    }
}
