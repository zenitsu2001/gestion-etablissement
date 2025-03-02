package isi.devops.gestion_etablissement.controleur;

import isi.devops.gestion_etablissement.domaine.Cours;
import isi.devops.gestion_etablissement.service.CoursService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cours")
@CrossOrigin("*")
public class CoursController {

    private final CoursService coursService;

    public CoursController(CoursService coursService) {
        this.coursService = coursService;
    }

    @PostMapping
    public Cours createCours(@RequestBody Cours cours) {
        return coursService.createCours(cours);
    }

    @GetMapping("/{id}")
    public Cours getCours(@PathVariable Long id) {
        return coursService.getCoursById(id);
    }

    @GetMapping
    public List<Cours> getAllCours() {
        return coursService.getAllCours();
    }

    @PutMapping("/{id}")
    public Cours updateCours(@PathVariable Long id, @RequestBody Cours cours) {
        return coursService.updateCours(id, cours);
    }

    @DeleteMapping("/{id}")
    public void deleteCours(@PathVariable Long id) {
        coursService.deleteCours(id);
    }
}
