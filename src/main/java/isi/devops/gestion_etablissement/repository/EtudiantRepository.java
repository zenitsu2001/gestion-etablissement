package isi.devops.gestion_etablissement.repository;
import isi.devops.gestion_etablissement.domaine.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}