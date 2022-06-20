package br.com.roberto.solidprinciples.datasources.db;

import br.com.roberto.solidprinciples.repositories.EmployeeRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public void save() {
        Connection connection = null;
        Statement stmt = null;
        String objStr ="ola";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB","root","password");
            stmt.getConnection().createStatement();
            stmt.execute("INSERT INTO Tb_Employee values("+objStr+")");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
