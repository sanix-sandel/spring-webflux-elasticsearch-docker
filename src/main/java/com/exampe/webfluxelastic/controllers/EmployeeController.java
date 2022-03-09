package com.exampe.webfluxelastic.controllers;

import com.exampe.webfluxelastic.dto.EmployeeDto;
import com.exampe.webfluxelastic.models.Employee;
import com.exampe.webfluxelastic.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
//@Tag(name = "Test APIs", description = "Test APIs for demo purpose")
@RequestMapping("employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("")
//    @Operation(description = "Get a test model demo", parameters = {
//            @Parameter(name = "name", in = ParameterIn.QUERY, required = true, description = "name parameter")
//    })
    public ResponseEntity<Flux<Employee>> findAll(){
        return ResponseEntity.ok(employeeService.findAll());
    }

    @PostMapping("")
    public ResponseEntity<Mono<Employee>>add(@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.add(employeeDto));
    }

    @GetMapping("/{name}")
    public ResponseEntity<Flux<Employee>> findByName(@PathVariable("name")String name){
        return ResponseEntity.ok(employeeService.findByName(name));
    }

    @GetMapping("by-organization/{organizationName}")
    public ResponseEntity<Flux<Employee>> findAll(@PathVariable("organizationName")String organizationName){
        return ResponseEntity.ok(employeeService.findByOrganization(organizationName));
    }


}
