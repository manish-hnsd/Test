package com.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="applicant_academic")
public class ApplicantAcademic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long degreeid;
	private long year;
	private long score;
}
