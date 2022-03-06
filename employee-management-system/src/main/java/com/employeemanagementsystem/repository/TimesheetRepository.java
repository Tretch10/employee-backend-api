package com.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagementsystem.model.Timesheet;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

}
