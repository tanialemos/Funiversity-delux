package be.dihertalem.funiversity.domain;

public class ProfessorMapper {

    public static Professor professorMapper(ProfessorDto professorDto) {
        return new Professor(professorDto.getFirstName(), professorDto.getLastName());
    }

    public static ProfessorDto professorMapper(Professor professor) {
        return new ProfessorDto(professor.getFirstName(), professor.getLastName());
    }
}
