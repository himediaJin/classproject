package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.TodoDTO;
import com.firstcoding.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "TodoRegisterController", value = "/todo/register")
@Log4j2
public class TodoRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 사용자가 입력할 수 있는 폼 화면
        log.info("register get ...");
        request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 사용자가 입력한 데이터를 받아서 처리
        log.info("register post ...");
        // 한글 처리 : post
        request.setCharacterEncoding("utf-8");
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");

        TodoDTO todoDTO = TodoDTO.builder()
                .todo(todo)
                .dueDate(LocalDate.parse(dueDate))
                .build();

        log.info(todoDTO);

        TodoService.getInstance().insertTodo(todoDTO);

        response.sendRedirect("/todo/list");
    }
}
