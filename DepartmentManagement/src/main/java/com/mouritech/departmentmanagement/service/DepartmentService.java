package com.mouritech.departmentmanagement.service;

import java.util.List;

import com.mouritech.departmentmanagement.domain.Department;

public interface DepartmentService {

	void addDepartment(Department dept);

	List<Department> getDepartment();

}
