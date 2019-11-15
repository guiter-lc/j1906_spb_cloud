package com.qf.j1906.j1906_spb_cloud_discover.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/add")
    public String addView(){
        return "add";
    }
}
