package com.geom.bank.mapper;

import com.geom.bank.dto.EmployeeDto;
import com.geom.bank.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getEmployeeName(),
                employee.getEmployeeEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getEmployeeName(),
                employeeDto.getEmployeeEmail()
        );
    }
}
