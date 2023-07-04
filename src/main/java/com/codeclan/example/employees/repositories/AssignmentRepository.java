package com.codeclan.example.employees.repositories;

import com.codeclan.example.employees.models.Assignment;
import com.codeclan.example.employees.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
