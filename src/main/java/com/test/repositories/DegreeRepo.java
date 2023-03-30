package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Degree;

public interface DegreeRepo extends JpaRepository<Degree, Long> {

}

