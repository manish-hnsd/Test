package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entities.Applicant;

@Service
public interface ApplicantService {

	// Retrive
	List<Applicant> getAllEmp();

	// Retrive by ID
	Applicant getEmpById(long id);

	// Delete
	void deleteEmp(long id);

	// Create
	void saveOrUpdateEmp(Applicant applicant);

	// Update
	void updateEmp(Applicant applicant, long id);
}

