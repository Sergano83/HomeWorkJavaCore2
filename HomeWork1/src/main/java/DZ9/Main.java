package DZ9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Course courseMath = new CourseImpl("math");
        Course coursePI = new CourseImpl("program engineer");
        Course coursePhysics = new CourseImpl("physics");
        Course courseChemistry = new CourseImpl("chemistry");
        Course courseGym = new CourseImpl("gym");
        Course courseNoName = new CourseImpl("noName");

        Student student1 = new StudentImpl("ВАНЯ", Arrays.asList(courseMath,coursePhysics,coursePI,courseChemistry));
        Student student2 = new StudentImpl("КОЛЯ", Arrays.asList(courseGym,coursePhysics,courseChemistry));
        Student student3 = new StudentImpl("РЕТЯ", Arrays.asList(courseChemistry,courseGym,coursePI));
        Student student4 = new StudentImpl("ВАСЯ", Arrays.asList(courseMath,coursePhysics,coursePI,courseNoName));
        Student student5 = new StudentImpl("КОСТЯ", Arrays.asList(courseMath,coursePhysics,courseGym,courseChemistry));

        courseStudent(Stream.of(student1,student2,student3,student4,student5),courseMath )
                .forEach(student -> System.out.println(student.getName() + " записан на курс " + courseMath.courseName()));

        smartStudent(Stream.of(student1,student2,student3,student4,student5))
                .forEach(student -> System.out.println(" Лутшие студенты " + student.getName()));

        uniqueCourse(Stream.of(student1,student2,student3,student4,student5))
                .forEach(student -> System.out.println(" Уникальнные курс посещанет " + student.getClass()));

//        visitStudent(Stream.of(student1,student2,student3,student4,student5))







    }

    public static List<Student> courseStudent(Stream<Student> studentStream, Course course){
        return studentStream
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }


    public static List<Student> smartStudent(Stream<Student> studentStream){

        Comparator<Student> studentComparator = Comparator.comparingInt(student -> student.getAllCourses().size());

        return studentStream
                .sorted(studentComparator.reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Course> uniqueCourse(Stream<Student> studentStream){
        return studentStream
                .map(Student::getAllCourses)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }
    public static List<Student> visitStudent(Stream<Student> studentStream, Course course){
        return studentStream
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }

}

