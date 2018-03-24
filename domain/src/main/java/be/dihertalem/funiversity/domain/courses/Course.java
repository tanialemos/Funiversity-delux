package be.dihertalem.funiversity.domain.courses;

import java.util.UUID;

public class Course {

    private String id;
    private String name;
    private int studyPoints;
    private CourseCategory courseCategory;

    public Course(String name, int studyPoints, CourseCategory courseCategory) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.studyPoints = studyPoints;
        this.courseCategory = courseCategory;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public CourseCategory getCourseCategory() {
        return courseCategory;
    }
}
