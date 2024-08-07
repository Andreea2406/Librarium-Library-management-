package com.andreea.librarium.repositories;

import com.andreea.librarium.model.Imprumuturi;
import com.andreea.librarium.model.Utilizatori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImprumuturiRepository extends JpaRepository<Imprumuturi, Integer> {
    List<Imprumuturi> findByIdUtilizator_Id(Integer idUtilizator);
    void deleteByIdUtilizator(Utilizatori utilizator);

}
