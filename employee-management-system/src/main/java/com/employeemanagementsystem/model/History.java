package com.employeemanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history")
public class History {
	private long id;
	private String empHistory;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpHistory() {
		return empHistory;
	}
	public void setEmpHistory(String empHistory) {
		this.empHistory = empHistory;
	}
	public History(long id, String empHistory) {
		super();
		this.id = id;
		this.empHistory = empHistory;
	}
	
	
	
	

}
