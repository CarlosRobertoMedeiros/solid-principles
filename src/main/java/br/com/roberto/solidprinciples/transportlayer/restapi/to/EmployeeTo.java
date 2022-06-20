package br.com.roberto.solidprinciples.transportlayer.restapi.to;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeTo {
    private String employeeName;
    private String employeeAdress;
    private String employeeNumber;
    private String employeeType;
}
