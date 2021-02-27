package com.feyi.employeemanagementsystem.repositories;

import com.feyi.employeemanagementsystem.models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary,Long>{

}