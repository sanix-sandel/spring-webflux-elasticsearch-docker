package com.exampe.webfluxelastic.services;

import com.exampe.webfluxelastic.dto.EmployeeDto;
import com.exampe.webfluxelastic.models.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Mono<Employee>add(EmployeeDto employeeDto);
    Flux<Employee>findByName(String name);
    Flux<Employee>findAll();
    Flux<Employee>findByOrganization(String organizationName);



}
