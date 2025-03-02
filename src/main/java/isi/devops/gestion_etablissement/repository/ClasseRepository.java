package isi.devops.gestion_etablissement.repository;

import isi.devops.gestion_etablissement.domaine.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseRepository extends JpaRepository<Classe, Long> {
}