package br.com.roberto.solidprinciples.interactors;

import br.com.roberto.solidprinciples.entities.Employee;
import br.com.roberto.solidprinciples.repositories.EmployeeRepository;
import br.com.roberto.solidprinciples.transportlayer.mapper.EmployeeMapper;
import br.com.roberto.solidprinciples.transportlayer.openapi.model.EmployeeResponse;
//import br.com.roberto.solidprinciples.transportlayer.restapi.to.EmployeeTo;
import br.com.roberto.solidprinciples.transportlayer.restapi.EmployeeRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeUseCase {

    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    public EmployeeUseCase(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeResponse> getEmployees() {
        List<Employee> empregados = employeeRepository.findAll();
        List<EmployeeResponse> empregadosResponse = new ArrayList<>();
        empregados.stream().forEach(employee -> {
            EmployeeResponse employeeResponse = new EmployeeResponse();
            employeeResponse.setEmployeeId(employee.getEmployeeId());
            employeeResponse.setEmployeeType(employee.getEmployeeType());
            employeeResponse.setEmployeeNumber(employee.getEmployeeNumber());
            employeeResponse.setEmployeeName(employee.getEmployeeName());
            employeeResponse.setEmployeeAddress(employee.getEmployeeAdress());
            empregadosResponse.add(employeeResponse);
        });
        return empregadosResponse;
    }
    public EmployeeResponse save(EmployeeRequest employeeRequest){
        Employee employee = new Employee();
        employee.setEmployeeAdress(employeeRequest.getEmployeeAddress());
        employee.setEmployeeType(employeeRequest.getEmployeeType());
        employee.setEmployeeNumber(employeeRequest.getEmployeeNumber());
        employee.setEmployeeName(employeeRequest.getEmployeeName());
        Employee employeeInterno = employeeRepository.save(employee);
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setEmployeeId(employeeInterno.getEmployeeId());
        employeeResponse.setEmployeeType(employeeInterno.getEmployeeType());
        employeeResponse.setEmployeeNumber(employeeInterno.getEmployeeNumber());
        employeeResponse.setEmployeeAddress(employeeInterno.getEmployeeAdress());
        employeeResponse.setEmployeeName(employeeInterno.getEmployeeName());
        return employeeResponse;
    }
//
//    public List<EmployeeResponse> getEmployees() {
//        List<EmployeeResponse> employees = new ArrayList<>();
//        //MapStructs
//
//
//        //employees.add(new EmployeeResponse(1,"Carlos Roberto","SQN","306 ap 201","horista"));
//        return employees;
//    }
//
//    public EmployeeTo getEmployeeById(String id) {
//        return new EmployeeTo("um","dois","tres","quatro");
//    }
//
//    public EmployeeTo update(EmployeeTo employeeTo, Long id){
//        return new EmployeeTo("um","dois","tres","quatro");
//    }
//
//    public void deleteEmployeeById(Long employeeId) {
//        //Apenas Deleta
//    }
}
