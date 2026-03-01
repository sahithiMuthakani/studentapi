package com.example.studentapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentapi.entity.Employee;
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
