package be.dihertalem.funiversity.domain.courses;

public enum CourseCategory {
    CSC ("Computer Sciences"),
    MAT ("Mathematics"),
    PHY("Physics"),
    MKT("Marketing");

    String fullName;

    CourseCategory(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
