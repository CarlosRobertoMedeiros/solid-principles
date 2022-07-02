package br.com.roberto.solidprinciples.entities;

import javax.persistence.*;


@Entity
@Table(name = "Tb_Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String employeeName;
    private String employeeAdress;
    private String employeeNumber;
    private String employeeType;

    public Employee(String employeeName, String employeeAdress, String employeeNumber, String employeeType) {
        this.employeeName = employeeName;
        this.employeeAdress = employeeAdress;
        this.employeeNumber = employeeNumber;
        this.employeeType = employeeType;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAdress() {
        return employeeAdress;
    }

    public void setEmployeeAdress(String employeeAdress) {
        this.employeeAdress = employeeAdress;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public void calculateTax() {
//        if (this.getEmployeeType().equals("fulltime")){
//            //Tax calc for FullTime
//        }
//        if (this.getEmployeeType().equals("contract")){
//            //Tax calc for Contract
//        }
    }

}
