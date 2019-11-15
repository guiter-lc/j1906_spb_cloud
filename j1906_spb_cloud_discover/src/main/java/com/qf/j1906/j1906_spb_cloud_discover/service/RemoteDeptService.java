package com.qf.j1906.j1906_spb_cloud_discover.service;

import com.qf.j1906.pojo.Dept;

import java.util.List;

public interface RemoteDeptService {

    List<Dept> findAll();

    Dept findById(int id);
    Boolean saveDept(Dept dept);
    Boolean updateDept(Dept dept);
    Boolean deleteDept(int id);
}
