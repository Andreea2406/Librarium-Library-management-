package com.andreea.librarium.repositories;
import com.andreea.librarium.model.Rol;
import com.andreea.librarium.model.Utilizatori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//public interface CustomerRepository extends JpaRepository<Customer, String>
@Repository

public interface UtilizatoriRepository extends JpaRepository<Utilizatori,Long> {




      Optional<Utilizatori>findByEmail(String email);

      Optional<Utilizatori> findByEmailAndParola(String email, String parola);
      Utilizatori findById(Integer id);



//      Utilizatori deleteById(Integer id);

//      Utilizatori findByName(String nume);
      // Optional<Rol> findByName(String name);



}
