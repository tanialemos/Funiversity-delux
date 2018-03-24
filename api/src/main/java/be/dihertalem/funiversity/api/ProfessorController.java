package be.dihertalem.funiversity.api;

import be.dihertalem.funiversity.domain.professors.Professor;
import be.dihertalem.funiversity.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/professors")
public class ProfessorController {

    private Service service;

    @Inject
    public ProfessorController(Service service) {
        this.service = service;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> getProfessors(){
        List<Professor> profs = new ArrayList<Professor>();
        for (Professor professor : service.getProfessors().values()) {
            profs.add(professor);
        }
        return profs;
    }
}
