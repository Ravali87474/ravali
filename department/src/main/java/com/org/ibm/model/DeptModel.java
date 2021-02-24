package com.org.ibm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeptModel {
    @Id
    private int deptId;
    private String  deptName;
    private Double deptSalary;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Double getDeptSalary() {
        return deptSalary;
    }

    public void setDeptSalary(Double deptSalary) {
        this.deptSalary = deptSalary;
    }



    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}
