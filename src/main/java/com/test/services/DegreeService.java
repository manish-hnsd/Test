package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entities.Degree;

@Service
public interface DegreeService {

	// Retrive
	List<Degree> getAllDegree();

	// Retrive by ID
	Degree getDegreeById(long id);

	// Delete
	void deleteDegree(long id);

	// Create
	void saveOrUpdateDegree(Degree applicant);

	// Update
	void updateDegree(Degree applicant, long id);
}
