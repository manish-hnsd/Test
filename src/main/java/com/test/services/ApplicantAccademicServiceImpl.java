package com.test.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.ApplicantAcademic;
import com.test.repositories.ApplicantaccademicRepo;

@Service
public class ApplicantAccademicServiceImpl implements ApplicantAcademicService{

	@Autowired 
	private ApplicantaccademicRepo applicantAccademicRepo;

	@Override
	public List<ApplicantAcademic> getAllEmp() {
		List<ApplicantAcademic> applicant = new ArrayList<>();
		applicantAccademicRepo.findAll().forEach(a1 -> applicant.add(a1));
		return applicant;
	}

	@Override
	public ApplicantAcademic getEmpById(long id) {
		return applicantAccademicRepo.findById(id).get();
	}

	@Override
	public void deleteEmp(long id) {
		applicantAccademicRepo.deleteById(id);
		
	}

	@Override
	public void saveOrUpdateEmp(ApplicantAcademic applicant) {
		applicantAccademicRepo.save(applicant);
		
	}

	@Override
	public void updateEmp(ApplicantAcademic applicant, long id) {
		applicantAccademicRepo.save(applicant);
		
	}
	


}

