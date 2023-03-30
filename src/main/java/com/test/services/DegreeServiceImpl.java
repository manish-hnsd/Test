package com.test.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Degree;
import com.test.repositories.DegreeRepo;

@Service
public class DegreeServiceImpl implements DegreeService{

	@Autowired 
	private DegreeRepo degreeRepo;

	@Override
	public List<Degree> getAllDegree() {
		List<Degree> degree = new ArrayList<>();
		degreeRepo.findAll().forEach(d1 -> degree.add(d1));
		return degree;
	}

	@Override
	public Degree getDegreeById(long id) {
		return degreeRepo.findById(id).get();
	}

	@Override
	public void deleteDegree(long id) {
		degreeRepo.deleteById(id);
		
	}

	@Override
	public void saveOrUpdateDegree(Degree applicant) {
		degreeRepo.save(applicant);
		
	}

	@Override
	public void updateDegree(Degree applicant, long id) {
		degreeRepo.save(applicant);
		
	}
}
