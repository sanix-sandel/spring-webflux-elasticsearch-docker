package com.exampe.webfluxelastic.bootstrap;

import com.exampe.webfluxelastic.models.Department;
import com.exampe.webfluxelastic.models.Employee;
import com.exampe.webfluxelastic.models.Organization;
import com.exampe.webfluxelastic.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final EmployeeRepository employeeRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
        Employee employee=new Employee();
        employee.setPosition("HR");
        employee.setName("NIcki");
        employee.setAge(23);

        Organization organization=new Organization();
        organization.setName("GEO");
        organization.setAddress("Tokyo");
        organization.setId(1L);

        Department department=new Department();
        department.setId(2L);
        department.setName("De");

        employee.setOrganization(organization);
        employee.setDepartment(department);

        employeeRepository.save(employee).subscribe();

        Employee employee1=new Employee();
        employee1.setPosition("MANAGER");
        employee1.setName("NIckiS");
        employee1.setAge(23);

        Organization organization1=new Organization();
        organization1.setName("GEO ADVENTURES");
        organization1.setAddress("Tokyo");
        organization1.setId(1L);

        Department department1=new Department();
        department1.setId(2L);
        department1.setName("De");

        employee1.setOrganization(organization1);
        employee1.setDepartment(department1);

        employeeRepository.save(employee1).subscribe();

    }


}
