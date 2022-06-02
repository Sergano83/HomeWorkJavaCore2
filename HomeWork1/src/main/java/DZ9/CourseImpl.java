package DZ9;

public class CourseImpl implements Course {
    private String courseName;
    public CourseImpl(String courseName) {
    }
    @Override
    public String courseName() {
        return courseName;
    }
}
