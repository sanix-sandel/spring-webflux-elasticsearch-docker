package com.exampe.webfluxelastic.repository;

import com.exampe.webfluxelastic.models.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {

    Flux<Employee> findAllByOrganizationName(String organizationName);
    Flux<Employee> findAllByName(String name);
}
