package be.dihertalem.funiversity.api.professors;

public class ProfessorDto {

    private int id;
    private String firstName;
    private String lastName;

    public ProfessorDto(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
