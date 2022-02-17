package com.mouritech.departmentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.departmentmanagement.domain.Department;
import com.mouritech.departmentmanagement.service.DepartmentService;


@RestController
@RequestMapping(value = "/")
public class DepartmentController {
	
	public class EmployeeProfileController {
		
		@Autowired
		private DepartmentService depService;
		
		@PostMapping
		public void addDepartment(@RequestBody Department dept) {
			depService.addDepartment(dept);
		}
		
		@GetMapping
		public List<Department> getDepartment() {

			return depService.getDepartment();
		}
	}
}
