package com.apiecommerce.apiecomerce.server.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiecommerce.apiecomerce.server.entities.Sacola;
import com.apiecommerce.apiecomerce.server.entities.Usuario;

@Repository
public interface SacolaRepository extends JpaRepository<Sacola, Long> {

    Sacola findByUsuario(Usuario usuario);

}
