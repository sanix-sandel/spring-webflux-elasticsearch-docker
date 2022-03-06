package com.exampe.webfluxelastic.services;

import com.exampe.webfluxelastic.dto.EmployeeDto;
import com.exampe.webfluxelastic.models.Employee;
import com.exampe.webfluxelastic.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Override
    public Mono<Employee> add(EmployeeDto employeeDto) {
        Employee employee=new Employee();
        employee.setAge(employeeDto.getAge());
        employee.setDepartment(employee.getDepartment());
        employee.setName(employee.getName());
        employee.setOrganization(employee.getOrganization());
        employee.setPosition(employee.getPosition());
        return employeeRepository.save(employee);
    }

    @Override
    public Flux<Employee> findByName(String name) {
        return employeeRepository.findAllByName(name);
    }

    @Override
    public Flux<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Flux<Employee> findByOrganization(String organizationName) {
        return employeeRepository.findAllByOrganizationName(organizationName);
    }
}
