import base.*;
import uni.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jasem", "1");
        Person person2 = new Person("Jafar", "2");
        Person person3 = new Person("Javad", "3");
        Person person4 = new Person("Jafari", "4");
        Person person5 = new Person("Javadi", "5");

        Major major1 = new Major("Computer Engineering", 100);
        Major major2 = new Major("Computer Science", 100);

        System.out.println("Name:");
        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person3.name);
        System.out.println("ID:");

        Student student1 = new Student(1, 404, major1.id);
        Student student2 = new Student(2, 404, major1.id);
        Student student3 = new Student(3, 404, major2.id);

        System.out.println("Name:  ID:");

        Professor professor1 = new Professor(4, major1.id);
        Professor professor2 = new Professor(5, major2.id);

        Course course1 = new Course("MathScience", 3);
        Course course2 = new Course("Physics", 3);
        Course course3 = new Course("Programming", 4);

        System.out.println(person4.name + " " + professor1.PersonID);
        System.out.println(person5.name + " " + professor2.PersonID);

        PresentedCourse MathScience = new PresentedCourse(course1.id, professor1.id, 85);
        PresentedCourse Physics = new PresentedCourse(course2.id, professor1.id, 85);
        PresentedCourse Programming = new PresentedCourse(course3.id, professor2.id, 85);

        MathScience.addStudent(1);
        MathScience.addStudent(2);

        Physics.addStudent(1);
        Physics.addStudent(2);
        Physics.addStudent(3);

        Programming.addStudent(3);

        Transcript transcript1 = new Transcript(student1.id);
        Transcript transcript2 = new Transcript(student2.id);
        Transcript transcript3 = new Transcript(student3.id);

        transcript1.setGrade(MathScience.id, 10.0);
        transcript1.setGrade(Physics.id, 11.0);
        transcript2.setGrade(MathScience.id, 13.0);
        transcript2.setGrade(Physics.id, 14.0);
        transcript3.setGrade(Physics.id, 16.0);
        transcript3.setGrade(Programming.id, 17.0);


        System.out.println("Transcript Of " + person1.name);
        transcript1.printTranscript();
        System.out.println("Transcript Of " + person2.name);
        transcript2.printTranscript();
        System.out.println("Transcript Of " + person3.name);
        transcript3.printTranscript();
    }
}