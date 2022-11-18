package com.todo.todospring.controller;

import com.todo.todospring.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoListController {

    //@Autowired
    private final TodoService todoService;

    public TodoListController(TodoService todoService) {
        this.todoService = todoService;
    }


    @RequestMapping("/todo/list")
    public String getTodoList(){

        //todoService.test();

        return "todo/list";
    }
}
