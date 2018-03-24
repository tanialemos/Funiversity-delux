package be.dihertalem.funiversity.api.courses;

import be.dihertalem.funiversity.domain.courses.Course;
import be.dihertalem.funiversity.domain.courses.CourseCategory;

import javax.inject.Named;

@Named
public class CourseMapper {

    public CourseDto mapCourseToDto(Course course){
        return new CourseDto(
                course.getId(),
                course.getName(),
                course.getStudyPoints(),
                course.getCourseCategory().toString());
    }

    public Course mapDtoToCourse(CourseDto courseDto){
        return new Course(
                courseDto.getName(),
                courseDto.getStudyPoints(),
                CourseCategory.valueOf(courseDto.getCourseCategory())
                );
    }

}
