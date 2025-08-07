package com.geom.bank.service;

import com.geom.bank.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    void deleteEmployee(Long employeeId);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(EmployeeDto employeeDto, Long employeeId);
}
