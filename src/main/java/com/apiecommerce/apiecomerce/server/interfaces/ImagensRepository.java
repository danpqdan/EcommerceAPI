package com.apiecommerce.apiecomerce.server.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiecommerce.apiecomerce.server.entities.Imagens;

@Repository
public interface ImagensRepository extends JpaRepository<Imagens, Long> {

}
