package vn.edu.iuh.fit.ontapcuoikysecurity1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee
        , Long>, JpaSpecificationExecutor<Employee> {
}