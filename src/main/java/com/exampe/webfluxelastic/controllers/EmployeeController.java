package com.exampe.webfluxelastic.controllers;

import com.exampe.webfluxelastic.dto.EmployeeDto;
import com.exampe.webfluxelastic.models.Employee;
import com.exampe.webfluxelastic.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("")
    public Flux<Employee> findAll(){
        return employeeService.findAll();
    }

    @PostMapping("")
    public Mono<Employee>add(@RequestBody EmployeeDto employeeDto){
        return employeeService.add(employeeDto);
    }

    @GetMapping("/{name}")
    public Flux<Employee> findByName(@PathVariable("name")String name){
        return employeeService.findByName(name);
    }

    @GetMapping("/{organizationName}")
    public Flux<Employee> findAll(@PathVariable("organizationName")String organizationName){
        return employeeService.findByOrganization(organizationName);
    }


}
