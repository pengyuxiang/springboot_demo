package com.yuxiang.dao;

import com.yuxiang.pojo.Department;
import com.yuxiang.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ReactiveAdapterRegistry;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
@Repository

public class EmployeeDao {
    private static Map<Integer, Employee> employees;
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees.put(1001,new Employee(1001,"AA","aaaa",1,new Department(101,"人事部")));
        employees.put(1002,new Employee(1002,"AA","aaaa",1,new Department(102,"人事部2")));
        employees.put(1003,new Employee(1003,"AA","aaaa",1,new Department(103,"人事部3")));
        employees.put(1004,new Employee(1004,"AA","aaaa",1,new Department(104,"人事部4")));
        employees.put(1005,new Employee(1005,"AA","aaaa",1,new Department(105,"人事部5")));

    }

    private static Integer initId=1006;
    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartmentsById(employee.getDepartment().getId()));

        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }
}
