package br.com.roberto.solidprinciples.transportlayer.restapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeRequest {
    private String EmployeeName;
    private String EmployeeAddress;
    private String EmployeeNumber;
    private String EmployeeType;
}
