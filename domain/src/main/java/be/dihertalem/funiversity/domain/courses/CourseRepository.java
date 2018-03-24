package be.dihertalem.funiversity.domain.courses;

import java.util.*;
import java.util.stream.Collectors;

public class CourseRepository {

    private Map<String, Course> courseRepository;
    private Course course1;
    private Course course2;
    private Course course3;
    private Course course4;
    private Course course5;

    public CourseRepository() {
        this.courseRepository = new HashMap<String, Course>();
        generateDataToFillTheRepository();
    }

    void generateDataToFillTheRepository(){
        course1 = new Course("Java for Experts", 10, CourseCategory.CSC);
        course2 = new Course("Maven for Experts", 7, CourseCategory.CSC);
        course3 = new Course("Spring for Experts", 6, CourseCategory.CSC);
        course4 = new Course("Beyond Black Holes", 5, CourseCategory.PHY);
        course5 = new Course("REST for Experts", 3, CourseCategory.CSC);
        courseRepository.put(course1.getId(), course1);
        courseRepository.put(course2.getId(), course2);
        courseRepository.put(course3.getId(), course3);
        courseRepository.put(course4.getId(), course4);
        courseRepository.put(course5.getId(), course5);
    }

    public List<Course> getAllCoursesFromRepository(){
        return Collections.unmodifiableList(new ArrayList<Course>(courseRepository.values()));
    }

    public List<Course> getCourseByCategory(CourseCategory courseCategory){
        return courseRepository.values().stream()
                .filter(x -> x.getCourseCategory().equals(courseCategory))
                .collect(Collectors.toList());
    }

    public void addCourseToRepository(Course course){
        courseRepository.put(course.getId(), course);
    }
}
