package com.test.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="applicant")
public class Applicant {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "applicantname")
	private String applicantname;
}
