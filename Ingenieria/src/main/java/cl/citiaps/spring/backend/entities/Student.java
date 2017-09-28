package cl.citiaps.spring.backend.entities;


import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Table(name="student")
@NamedQuery(name="Student.findAll", query="SELECT a FROM Student a")
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="student_id", unique=true, nullable=false)
	private int studentId;

	@Column(name="rut", nullable=false, length=45)
	private String rut;

	@Column(name="name", nullable=false, length=45)
	private String name;

	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="career", nullable=false)
	private String career;
	
	@Column(name="entry_year", nullable=false)
	private int entryYear;

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEntryYear() {
		return entryYear;
	}

	public void setEntryYear(int entryYear) {
		this.entryYear = entryYear;
	}

}
