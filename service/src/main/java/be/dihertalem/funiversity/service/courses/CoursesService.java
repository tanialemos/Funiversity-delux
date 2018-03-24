package be.dihertalem.funiversity.service.courses;

import be.dihertalem.funiversity.domain.courses.Course;
import be.dihertalem.funiversity.domain.courses.CourseCategory;
import be.dihertalem.funiversity.domain.courses.CourseRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class CoursesService {

    CourseRepository courseRepository;

    @Inject
    public CoursesService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses(){
        return courseRepository.getAllCoursesFromRepository();
    }

    public List<Course> getCourseByCategory(CourseCategory courseCategory){
        return courseRepository.getCourseByCategory(courseCategory);
    }

    public void addNewCourse(Course course){
        courseRepository.addCourseToRepository(course);
    }

}
