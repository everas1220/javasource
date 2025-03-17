package generics;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name =" + name + "]";
    }

}

class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

class HighStudent extends Student {

    public HighStudent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Course<T> {
    private String name;
    private List<T> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = new ArrayList<>(capacity);
    }

    public void add(T t) {
        this.students.add(t);
    }

    public String getName() {
        return name;
    }

    public List<T> Getstudents() {
        return students;
    }

}

class CourseEx {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course("일반인 과정", 20);
        personCourse.add(new Person("홍길동"));
        personCourse.add(new Worker("김도비"));
        personCourse.add(new Student("최세라"));
        personCourse.add(new HighStudent("박고딩"));
        registerCourse(personCourse);

        Course<Person> sorkerCourse = new Course("직장인 과정", 10);
        personCourse.add(new Worker("최도비"));
        registerCourseWorker(workerCourse);

        Course<Person> studentCourse = new Course("학생 과정", 5);
        personCourse.add(new Student("최세라"));
        registerCourse(studentCourse);
        registerCourseStudent(studentCourse);

        Course<Person> HighCourse = new Course("고등학생 과정", 5);
        personCourse.add(new HighStudent("박고딩"));
        registerCourse(HighCourse);
        registerCourseStudent(HighCourse);

    }

    static void registerCourse(Course<?> course) {
        // 모든 과정을 등록할수 있는 대상
        System.out.println(course.getName() + " 수강생 " + course.Getstudents());
    }

    static void registerCourseStudent(Course<? extends Student> course) {
        // Student와 HighSudent만 등록할수 있는 대상
        System.out.println(course.getName() + " 수강생 " + course.Getstudents());
    }

    static void registerCourseWorker(Course<? super Worker> course) {
        // Worker이거나 Person만 등록할수 있는 대상
        System.out.println(course.getName() + " 수강생 " + course.Getstudents());
    }

}