package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {
    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> course = optional.empty();
        for (Course c : courses) {
            if (c.getPrice() <= maxPrice) {
                course = optional.of(c);
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No course has been found!"));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Course> course = optional.empty();
        for (Course c : courses) {
            if (c.getName().equalsIgnoreCase(name) && c.getLevel() == level) {
                course = optional.of(c);
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course!")).getPrice();
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<String> course = optional.empty();
        for (Course c : courses) {
            if (c.getLevel() == level) {
                course = optional.of(c.getName());
            }
        }
        return course.orElse("No such named course!");
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }
}