package br.com.roberto.solidprinciples.repositories;

import br.com.roberto.solidprinciples.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
