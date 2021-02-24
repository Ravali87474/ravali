package com.org.ibm.controller;

import com.org.ibm.model.DeptModel;
import com.org.ibm.model.EmpAndDeptModel;
import com.org.ibm.model.EmpModel;
import com.org.ibm.repository.DeptRepo;
import com.org.ibm.repository.EmpAndDeptRepo;
import com.org.ibm.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmpAndDeptController {
    @Autowired
    EmpRepo empRepo;

    @Autowired
    DeptRepo deptRepo;

    @Autowired
    EmpAndDeptRepo empAndDeptRepo;

    @PostMapping("/create employ")
    public void createEmp(@RequestBody EmpModel empModel){
        empRepo.save(empModel);
    }

    @PostMapping("/create dept")
    public void creatDept(@RequestBody DeptModel deptModel){
        deptRepo.save(deptModel);
    }

    @PostMapping("/create emp and dept")
    public void creatEmpAndDept(@RequestBody EmpAndDeptModel empAndDeptModel){
        empAndDeptRepo.save(empAndDeptModel);
    }

    @GetMapping("/get empDetails")
    public List<EmpModel> getEmpDetails(){
        List<EmpModel> all = empRepo.findAll();
        return all;
    }

    @GetMapping("/get deptDetails")
    public List<DeptModel> getDeptDetails(){
        List<DeptModel> all = deptRepo.findAll();
        return all;
    }

    @GetMapping("/emp/dept/create")
    public void createEmpAndDept(){
        List<EmpModel> empModelList = empRepo.findAll();
        List<DeptModel> deptModelList = deptRepo.findAll();
        for (int i=0;i<empModelList.size();i++)
            for (int j=0;j<deptModelList.size();j++){
                EmpModel empModel = empModelList.get(i);
                DeptModel deptModel = deptModelList.get(j);
                if (empModel.getDeptId()==deptModel.getDeptId()){
                    EmpAndDeptModel empAndDeptModel=new EmpAndDeptModel();
                    empAndDeptModel.setEmpId(empModel.getEmpId());
                    empAndDeptModel.setEmpName(empModel.getEmpName());
                    empAndDeptModel.setEmpGen(empModel.getEmpGen());
                    empAndDeptModel.setDeptId(deptModel.getDeptId());
                    empAndDeptModel.setDeptName(deptModel.getDeptName());
                    empAndDeptModel.setDeptSalary(deptModel.getDeptSalary());
                    empAndDeptRepo.save(empAndDeptModel);
                }
            }
    }

}
