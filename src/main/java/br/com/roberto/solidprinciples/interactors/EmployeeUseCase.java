package br.com.roberto.solidprinciples.interactors;

import br.com.roberto.solidprinciples.transportlayer.restapi.to.EmployeeTo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeUseCase {

    public void save(EmployeeTo employeeTo){
        System.out.println("Salvei");
    }

    public List<EmployeeTo> getEmployees() {
        List<EmployeeTo> employees = new ArrayList<>();
        employees.add(new EmployeeTo("car","los","asdf","FAS"));
        return employees;
    }

    public EmployeeTo getEmployeeById(String id) {
        return new EmployeeTo("um","dois","tres","quatro");
    }

    public EmployeeTo update(EmployeeTo employeeTo, Long id){
        return new EmployeeTo("um","dois","tres","quatro");
    }

    public void deleteEmployeeById(Long employeeId) {
        //Apenas Deleta
    }
}
