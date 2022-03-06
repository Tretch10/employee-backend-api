package com.employeemanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "timesheet")
public class Timesheet {
	private long id;
	private String firstName;
	private String lastName;
	private long ssn;
	private long hoursWorked;
	private long hourlyPay;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public long getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(long hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public long getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(long hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	
	
	

}
