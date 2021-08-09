package com.fisglobal.employeemanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// ORM : Object with tables
// fields ===> columns
// ORM : object relational mapping.
@Entity
@Table(name = "empl")
public class Employee {

	@Id
	private String empId;
	private String empFirstName;
	private String empLastName;
	private float empSalary;
	
}
