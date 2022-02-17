package com.mouritech.departmentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.departmentmanagement.domain.Department;
import com.mouritech.departmentmanagement.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository deptRepository;

	@Override
	public void addDepartment(Department dept) {
		deptRepository.save(dept);
		
	}

	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return deptRepository.findAll();
	}

}
