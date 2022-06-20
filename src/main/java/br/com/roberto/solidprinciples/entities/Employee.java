package br.com.roberto.solidprinciples.entities;

import lombok.Data;

@Data
public class Employee {
    private Long employeeId;
    private String employeeName;
    private String employeeAdress;
    private String employeeNumber;
    private String employeeType;

    public void calculateTax(){
        if (this.getEmployeeType().equals("fulltime")){
            //Tax calc for FullTime
        }
        if (this.getEmployeeType().equals("contract")){
            //Tax calc for Contract
        }
    }

}
