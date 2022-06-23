package br.com.roberto.solidprinciples.transportlayer.mapper;

import br.com.roberto.solidprinciples.entities.Employee;
import br.com.roberto.solidprinciples.transportlayer.openapi.model.EmployeeResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeResponse toEmployeeResponse(Employee employee);
}

