package br.com.roberto.solidprinciples.transportlayer.restapi;

import br.com.roberto.solidprinciples.interactors.EmployeeUseCase;
import br.com.roberto.solidprinciples.transportlayer.restapi.to.EmployeeTo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeRest {

    private final EmployeeUseCase employeeUseCase;

    public EmployeeRest(EmployeeUseCase employeeUseCase) {
        this.employeeUseCase = employeeUseCase;
    }

    @GetMapping()
    public List<EmployeeTo> getEmployees() {
        return this.employeeUseCase.getEmployees();
    }

    @GetMapping(value = "/{id}")
    public EmployeeTo getEmployeeById(@PathVariable("id") String id) {
        return this.employeeUseCase.getEmployeeById(id);
    }

    @PostMapping()
    public void save(@RequestBody EmployeeTo employeeTo) {
        this.employeeUseCase.save(employeeTo);
    }

    @PutMapping("/{id}")
    public EmployeeTo update(@RequestBody EmployeeTo employeeTo,
                             @PathVariable("id") Long employeeId) {
        return this.employeeUseCase.update(employeeTo, employeeId);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEmployeeById(@PathVariable("id")
                                   Long employeeId) {
        this.employeeUseCase.deleteEmployeeById(employeeId);
    }
}
