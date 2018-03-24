package be.dihertalem.funiversity.service;

import be.dihertalem.funiversity.domain.professors.Professor;
import be.dihertalem.funiversity.domain.professors.ProfessorRepository;

import javax.inject.Named;
import java.util.Map;

@Named
public class Service {

    ProfessorRepository repo = new ProfessorRepository();

    public Map<Integer, Professor> getProfessors(){
        try {
            return repo.getProfessors();
        } catch (IllegalArgumentException ex){
            throw new IllegalArgumentException("Empty array");
        }
    }

    public Professor getProfessor(int id){
        try {
            return repo.getProfessor(id);
        } catch (IllegalArgumentException ex){
            return new Professor("Unknown first name", "Unknown last name");
        }
    }

}
