package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Applicant;
import com.test.repositories.ApplicantRepo;


@RestController
public class ApplicantController {

	@Autowired
	private ApplicantRepo applicantRepo;
	
	
	@RequestMapping("/showApplicant")
	public String showReg(@ModelAttribute ("applicant") Applicant applicant){
		applicantRepo.save(applicant);
		return "showApplicant";
	}

}
