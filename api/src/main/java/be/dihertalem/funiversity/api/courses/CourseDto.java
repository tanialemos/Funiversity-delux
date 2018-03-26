package be.dihertalem.funiversity.api.courses;

public class CourseDto {

    private String id;
    private String name;
    private int studyPoints;
    private String courseCategory;

    public CourseDto() {
    }

    public CourseDto(String id, String name, int studyPoints, String courseCategory) {
        this.id = id;
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

    public String getCourseCategory() {
        return courseCategory;
    }
}
