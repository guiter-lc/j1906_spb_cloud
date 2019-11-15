package com.qf.j1906.service.impl;

import com.qf.j1906.mapper.DeptMapper;
import com.qf.j1906.pojo.Dept;
import com.qf.j1906.pojo.DeptExample;
import com.qf.j1906.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;


    @Override
    public List<Dept> findAll() {
        DeptExample example = new DeptExample();
        List<Dept> depts = deptMapper.selectByExample(example);
        return depts;
    }
    @Override
    public Dept findById(int id) {
        Dept dept = deptMapper.selectByPrimaryKey(id);
        return dept;
    }

    @Override
    public Boolean saveDept(Dept dept) {
        int insert = deptMapper.insert(dept);
        if(insert>0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateDept(Dept dept) {
        int i = deptMapper.updateByPrimaryKey(dept);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteDept(int id) {
        int i = deptMapper.deleteByPrimaryKey(id);
        if(i>0){
            return true;
        }
        return false;
    }


}

