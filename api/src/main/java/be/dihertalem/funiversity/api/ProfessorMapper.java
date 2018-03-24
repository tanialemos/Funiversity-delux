package be.dihertalem.funiversity.api;

import be.dihertalem.funiversity.domain.professors.Professor;

public class ProfessorMapper {

    public static ProfessorDto professorMapper(Professor professor) {
        return new ProfessorDto(professor.getId(), professor.getFirstName(), professor.getLastName());
    }
}
