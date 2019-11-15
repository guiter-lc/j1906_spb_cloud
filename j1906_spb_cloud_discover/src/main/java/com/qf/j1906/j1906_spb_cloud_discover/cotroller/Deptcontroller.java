package com.qf.j1906.j1906_spb_cloud_discover.cotroller;


import com.qf.j1906.j1906_spb_cloud_discover.service.RemoteDeptService;
import com.qf.j1906.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Deptcontroller {

    @Autowired
    private RemoteDeptService remoteDeptService;

    @RequestMapping(value = "/depts")
    @ResponseBody
    public List<Dept> selectAll(){
        List<Dept> all = remoteDeptService.findAll();
        return all;
    }

    @RequestMapping(value = "/dept",method = RequestMethod.GET)
    public String selectById(@RequestParam("id")int id, Model model){
        Dept dept = remoteDeptService.findById(id);
        model.addAttribute("dept",dept);
        return "dept";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updateDept(Dept dept){
        Boolean aBoolean = remoteDeptService.updateDept(dept);
        return "index";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteDept(@RequestParam("id")int id){
        Boolean aBoolean = remoteDeptService.deleteDept(id);
        return "index";
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insertDept(Dept dept){
        Boolean aBoolean = remoteDeptService.saveDept(dept);
        return "index";
    }


}
