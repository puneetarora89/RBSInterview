package com.rbs.interview.web.controller;

import com.rbs.interview.web.data.service.EmployeeService;
import com.rbs.interview.web.model.Employee;
import com.rbs.interview.web.utils.SortingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value={"/"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("master");
        return modelAndView;
    }

}
