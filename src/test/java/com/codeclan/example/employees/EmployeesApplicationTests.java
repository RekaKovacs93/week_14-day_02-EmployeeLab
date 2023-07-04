package com.codeclan.example.employees;

import com.codeclan.example.employees.models.Assignment;
import com.codeclan.example.employees.models.Department;
import com.codeclan.example.employees.models.Employee;
import com.codeclan.example.employees.models.Project;
import com.codeclan.example.employees.repositories.AssignmentRepository;
import com.codeclan.example.employees.repositories.DepartmentRepository;
import com.codeclan.example.employees.repositories.EmployeeRepository;
import com.codeclan.example.employees.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	AssignmentRepository assignmentRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Department oodservices = new Department("oodServices");
		departmentRepository.save(oodservices);

		ArrayList<Assignment> assignments = new ArrayList<>();
		Project project = new Project("Kill ALL daleks", 2793,assignments);
		projectRepository.save(project);

		Employee employee2 = new Employee("Rose", "Tyler", "e63", assignments, oodservices);
		Employee employee1 = new Employee("Clara", "Oswald", "e64", assignments, oodservices);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);

		Assignment assignment1 = new Assignment(employee1, project);
		Assignment assignment2 = new Assignment(employee2, project);
		assignmentRepository.save(assignment1);
		assignmentRepository.save(assignment2);
	}

}
