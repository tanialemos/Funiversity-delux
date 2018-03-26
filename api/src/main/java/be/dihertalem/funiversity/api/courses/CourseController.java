package be.dihertalem.funiversity.api.courses;

import be.dihertalem.funiversity.domain.courses.Course;
import be.dihertalem.funiversity.domain.courses.CourseCategory;
import be.dihertalem.funiversity.service.courses.CoursesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/courses")
public class CourseController {

    CoursesService coursesService;
    CourseMapper courseMapper;

    @Inject
    public CourseController(CoursesService coursesService, CourseMapper courseMapper) {
        this.coursesService = coursesService;
        this.courseMapper = courseMapper;
    }

    @GetMapping(path="/all_courses", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseDto> getAllCourses(){
        List<CourseDto> dtoList = new ArrayList<>();
        for (Course course : coursesService.getAllCourses()){
            dtoList.add(courseMapper.mapCourseToDto(course));
        }
        return dtoList;
    }

    @GetMapping(path="/{category}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseDto> getCourseByCategory(@PathVariable String category){
        List<CourseDto> dtoList = new ArrayList<>();
        for (Course course : coursesService.getCourseByCategory(CourseCategory.valueOf(category))){
            dtoList.add(courseMapper.mapCourseToDto(course));
        }
        return dtoList;
    }

    @PostMapping(path="create_course", produces = "application/json", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CourseDto createCourse(@RequestBody CourseDto courseDto){
        coursesService.addNewCourse(courseMapper.mapDtoToCourse(courseDto));
        return courseDto;
    }

}
