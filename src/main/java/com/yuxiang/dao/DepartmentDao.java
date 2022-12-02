package com.yuxiang.dao;

import com.yuxiang.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments;

    static {
        departments.put(101,new Department(101,"人事部"));
        departments.put(102,new Department(102,"人事部2"));
        departments.put(103,new Department(103,"人事部3"));
        departments.put(104,new Department(104,"人事部4"));
        departments.put(105,new Department(105,"人事部5"));
    }


    public Collection<Department> getDepartments(){
        return departments.values();
    }

    public Department getDepartmentsById(Integer id){
        return departments.get(id);
    }

}
