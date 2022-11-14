package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoListController", value = "/todo/list")
@Log4j2
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("todo list ...");

        request.setAttribute("title", "Todo List");
        request.setAttribute("todoList", TodoService.getInstance().getTodoList() );

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(request, response);
    }
}
