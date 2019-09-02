package com.fxm.study.controller;

import com.fxm.study.pojo.Student;
import com.fxm.study.service.StudentService;
import com.sun.tools.internal.xjc.ModelLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    StudentService studentService;
   @RequestMapping("/index")
    public String index(Model model,int i){
      Student student = studentService.selectByPrimaryKey(i);
      if(null!=student){
          System.out.println(student.getSname());
          model.addAttribute("username",student.getSname());
          Map<String, List<Student>> studentMap = new HashMap<>();
          List<Student> students = new ArrayList<Student>();
          students.add(student);
          studentMap.put("student",students);
          model.addAllAttributes(studentMap);
      }
      return "index";
   }
}
