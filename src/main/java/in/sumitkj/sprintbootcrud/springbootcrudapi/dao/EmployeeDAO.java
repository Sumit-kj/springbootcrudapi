package in.sumitkj.sprintbootcrud.springbootcrudapi.dao;

import in.sumitkj.sprintbootcrud.springbootcrudapi.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
