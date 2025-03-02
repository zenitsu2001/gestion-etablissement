package isi.devops.gestion_etablissement.controleur;
import isi.devops.gestion_etablissement.domaine.Classe;
import isi.devops.gestion_etablissement.service.ClasseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
@CrossOrigin("*")
public class ClasseController {

    private final ClasseService classeService;

    public ClasseController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @PostMapping
    public Classe createClasse(@RequestBody Classe classe) {
        return classeService.createClasse(classe);
    }

    @GetMapping("/{id}")
    public Classe getClasse(@PathVariable Long id) {
        return classeService.getClasseById(id);
    }

    @GetMapping
    public List<Classe> getAllClasses() {
        return classeService.getAllClasses();
    }

    @PutMapping("/{id}")
    public Classe updateClasse(@PathVariable Long id, @RequestBody Classe classe) {
        return classeService.updateClasse(id, classe);
    }

    @DeleteMapping("/{id}")
    public void deleteClasse(@PathVariable Long id) {
        classeService.deleteClasse(id);
    }
}
