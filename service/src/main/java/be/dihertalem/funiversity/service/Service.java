package be.dihertalem.funiversity.service;

import be.dihertalem.funiversity.domain.Professor;
import be.dihertalem.funiversity.domain.Repository;

import java.util.Map;

public class Service {

    Repository repo = new Repository();

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