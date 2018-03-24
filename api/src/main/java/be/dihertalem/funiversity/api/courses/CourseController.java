package be.dihertalem.funiversity.api.courses;

import be.dihertalem.funiversity.service.courses.CoursesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

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
}
