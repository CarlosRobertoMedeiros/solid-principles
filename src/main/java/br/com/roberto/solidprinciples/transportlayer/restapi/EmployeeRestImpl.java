package br.com.roberto.solidprinciples.transportlayer.restapi;

import br.com.roberto.solidprinciples.interactors.EmployeeUseCase;
import br.com.roberto.solidprinciples.transportlayer.openapi.api.EmployeesApi;
import br.com.roberto.solidprinciples.transportlayer.openapi.model.EmployeeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeRestImpl implements EmployeesApi {

    private final EmployeeUseCase employeeUseCase;

    public EmployeeRestImpl(EmployeeUseCase employeeUseCase) {
        this.employeeUseCase = employeeUseCase;
    }

    @Override
    public ResponseEntity<List<EmployeeResponse>> getEmployees() {
        List<EmployeeResponse> employees;
        employees = employeeUseCase.getEmployees();
        if(employees.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }

    @PostMapping()
    public ResponseEntity<EmployeeResponse> save(@Valid @RequestBody String employeeName,
                     @Valid @RequestBody String employeeAddress,
                     @Valid @RequestBody String employeeNumber,
                     @Valid @RequestBody String employeeType) {
        EmployeeRequest employeeRequest = new EmployeeRequest(employeeName,employeeAddress,employeeNumber,employeeType);
        EmployeeResponse employeeResponse = this.employeeUseCase.save(employeeRequest);

        if(employeeResponse==null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
    }

    //private final EmployeeUseCase employeeUseCase;

//    public EmployeeRestImpl(EmployeeUseCase employeeUseCase) {
//        this.employeeUseCase = employeeUseCase;
//    }



    //    @GetMapping()
//    public List<EmployeeTo> getEmployees() {
//        return this.employeeUseCase.getEmployees();
//    }
//
//    @GetMapping(value = "/{id}")
//    public EmployeeTo getEmployeeById(@PathVariable("id") String id) {
//        return this.employeeUseCase.getEmployeeById(id);
//    }
//
//    @PostMapping()
//    public void save(@RequestBody EmployeeTo employeeTo) {
//        this.employeeUseCase.save(employeeTo);
//    }
//
//    @PutMapping("/{id}")
//    public EmployeeTo update(@RequestBody EmployeeTo employeeTo,
//                             @PathVariable("id") Long employeeId) {
//        return this.employeeUseCase.update(employeeTo, employeeId);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public void deleteEmployeeById(@PathVariable("id")
//                                   Long employeeId) {
//        this.employeeUseCase.deleteEmployeeById(employeeId);
//    }
}
