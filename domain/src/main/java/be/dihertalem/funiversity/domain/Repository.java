package be.dihertalem.funiversity.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Repository {

    private Map<Integer, Professor> professors ;
    private Professor albert;
    private Professor stephen;
    private Professor tania;
    private Professor dirk;
    private Professor niels;
    private Professor gobelijn;
    private Professor barabas;

    public Repository() {
        professors = new HashMap<Integer, Professor>();
        createProfessors();
        addProfessorsToDatabase();
    }

    private void addProfessorsToDatabase() {
        professors.put(albert.getId(), albert);
        professors.put(stephen.getId(), stephen);
        professors.put(tania.getId(), tania);
        professors.put(dirk.getId(), dirk);
        professors.put(niels.getId(), niels);
        professors.put(gobelijn.getId(), gobelijn);
        professors.put(barabas.getId(), barabas);
    }

    private void createProfessors() {
        albert = new Professor("Albert", "Einstein");
        stephen = new Professor("Stephen", "Hawkins");
        tania = new Professor("Tania", "Lemos");
        dirk = new Professor("Dirk", "Hermans");
        niels = new Professor("Niels", "Delestinne");
        gobelijn = new Professor("Gobelijn", "Van Jommeke");
        barabas = new Professor("Barabas", "Van Suske en Wiske");
    }

    public Map<Integer, Professor> getProfessors() {
        return professors;
    }

    public void deleteProfessor(int professorId) {
        professors.remove(professorId);
    }

    public void addNewProfessor(Professor professor) {
        professors.put(professor.getId(), professor);
    }

    public void updateFirstName(int professorId, String newFirstName) {
        Professor professor  = professors.get(professorId);
        professor.setFirstName(newFirstName);
    }

    public void updateLastName(int professorId, String newLastName) {
        Professor professor  = professors.get(professorId);
        professor.setLastName(newLastName);
    }

    public Professor getProfessor(int id) {
        return professors.get(id);
    }
}
