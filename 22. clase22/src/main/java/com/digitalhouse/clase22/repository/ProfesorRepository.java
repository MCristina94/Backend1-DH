package com.digitalhouse.clase22.repository;

import com.digitalhouse.clase22.entity.Alumno;
import com.digitalhouse.clase22.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor,String> {
}
