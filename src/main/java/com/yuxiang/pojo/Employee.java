package com.yuxiang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String Name;
    private String Email;



    private Integer gender;
    private Department department;
    private Date birth;

    public Employee(Integer id, String name, String email, Integer gender, Department department) {
        this.id = id;
        Name = name;
        Email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }

}
