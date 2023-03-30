package com.test.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Applicant;
import com.test.repositories.ApplicantRepo;

@Service
public class ApplicantServiceImpl implements ApplicantService{

	@Autowired 
	private ApplicantRepo applicantRepo;
	
	@Override
	public List<Applicant> getAllEmp() {
		List<Applicant> applicant = new ArrayList<>();
		applicantRepo.findAll().forEach(a1 -> applicant.add(a1));
		return applicant;
	}

	@Override
	public Applicant getEmpById(long id) {
		return applicantRepo.findById(id).get();
	}

	@Override
	public void deleteEmp(long id) {
		applicantRepo.deleteById(id);
		
	}

	@Override
	public void saveOrUpdateEmp(Applicant applicant) {
		applicantRepo.save(applicant);
		
	}

	@Override
	public void updateEmp(Applicant applicant, long id) {
		applicantRepo.save(applicant);
		
	}

}

