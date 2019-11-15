package com.qf.j1906.controller;


import com.qf.j1906.pojo.Dept;
import com.qf.j1906.service.DeptService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    private static final Logger log = LogManager.getLogger(DeptController.class);

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public List<Dept> findAll(){
        List<Dept> all = deptService.findAll();
        return all;
    }

    @RequestMapping(value = "/dept/{id}",method = RequestMethod.GET)
    public Dept findDeptById(@PathVariable("id")int id){
        Dept dept = deptService.findById(id);
        return dept;
    }

    @RequestMapping(value = "/deptAd",method = RequestMethod.POST)
    public Boolean saveDept(@RequestBody Dept dept){
        log.info(dept.toString()+"===============");
        Boolean dept1 = deptService.saveDept(dept);
        return dept1;
    }

    @RequestMapping(value = "/deptUp",method = RequestMethod.PUT)
    public Boolean updateDept(@RequestBody Dept dept){
        log.info(dept.toString());
        Boolean dept1 = deptService.updateDept(dept);
        return dept1;
    }

    @RequestMapping(value = "/deptDe/{id}",method = RequestMethod.DELETE)
    public Boolean deleteDept(@PathVariable("id") int id){
        Boolean bl = deptService.deleteDept(id);
        return bl;
    }
}
