package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Applicant;

public interface ApplicantRepo extends JpaRepository<Applicant, Long> {

}

