package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entities.ApplicantAcademic;

@Service
public interface ApplicantAcademicService {

	// Retrive
	List<ApplicantAcademic> getAllEmp();

	// Retrive by ID
	ApplicantAcademic getEmpById(long id);

	// Delete
	void deleteEmp(long id);

	// Create
	void saveOrUpdateEmp(ApplicantAcademic applicant);

	// Update
	void updateEmp(ApplicantAcademic applicant, long id);
}

