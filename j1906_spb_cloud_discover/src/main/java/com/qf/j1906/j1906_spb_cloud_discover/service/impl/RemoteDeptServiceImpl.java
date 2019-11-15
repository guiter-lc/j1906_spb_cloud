package com.qf.j1906.j1906_spb_cloud_discover.service.impl;

import com.qf.j1906.j1906_spb_cloud_discover.service.RemoteDeptService;
import com.qf.j1906.pojo.Dept;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Service
public class RemoteDeptServiceImpl implements RemoteDeptService {

    private static final Logger log = LogManager.getLogger(RemoteDeptServiceImpl.class);
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Dept> findAll() {
        Dept[] forObject = restTemplate.getForObject("http://SERVICE-PROVIDER2/depts", Dept[].class);
        List<Dept> depts = Arrays.asList(forObject);
        return depts;
    }

    @Override
    public Dept findById(int id) {
        Dept dept = restTemplate.getForObject("http://SERVICE-PROVIDER2/dept/"+id, Dept.class);
        return dept;
    }

    @Override
    public Boolean saveDept(Dept dept) {
        log.info(dept.toString());
        try {
            //restTemplate.postForEntity("http://SERVICE-PROVIDER2/deptAd", dept, Dept.class);
            restTemplate.postForObject("http://SERVICE-PROVIDER2/deptAd", dept, boolean.class);
            return true;
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public Boolean updateDept(Dept dept) {
        log.info("=========="+dept);
        try {

            restTemplate.put("http://SERVICE-PROVIDER2/deptUp",dept);
            log.info("==========udate ok!");
            return true;
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean deleteDept(int id) {
        try {
            restTemplate.delete("http://SERVICE-PROVIDER2/deptDe/{1}",id);
            return true;
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return false;
    }
}
