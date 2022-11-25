package com.app.manager.controller.emp;

import com.app.manager.domain.EmpDTO;
import com.app.manager.service.emp.EmpListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmpListcontroller {

    @Autowired
    private EmpListService empListService;

    @GetMapping("/emp/list")
    public void getEmpList(Model model){
        model.addAttribute("empList", empListService.getEmpList());
    }
}
