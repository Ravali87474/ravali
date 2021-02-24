package com.org.ibm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmpAndDeptModel {
    private int empId;
    private String empName;
    private String empGen;
    @Id
    private int deptId;
    private String  deptName;
    private Double deptSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpGen() {
        return empGen;
    }

    public void setEmpGen(String empGen) {
        this.empGen = empGen;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

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
}
