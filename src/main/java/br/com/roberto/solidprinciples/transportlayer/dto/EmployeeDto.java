package br.com.roberto.solidprinciples.transportlayer.dto;

public class EmployeeDto {
    private String EmployeeName;
    private String EmployeeAddress;
    private String EmployeeNumber;
    private String EmployeeType;

    public EmployeeDto(){}
    public EmployeeDto(String employeeName, String employeeAddress, String employeeNumber, String employeeType) {
        EmployeeName = employeeName;
        EmployeeAddress = employeeAddress;
        EmployeeNumber = employeeNumber;
        EmployeeType = employeeType;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        EmployeeAddress = employeeAddress;
    }

    public String getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public String getEmployeeType() {
        return EmployeeType;
    }

    public void setEmployeeType(String employeeType) {
        EmployeeType = employeeType;
    }
}
