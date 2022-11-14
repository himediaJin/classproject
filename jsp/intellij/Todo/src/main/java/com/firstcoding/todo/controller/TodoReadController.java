package com.firstcoding.todo.controller;

import com.firstcoding.todo.domain.OldTodoDTO;
import com.firstcoding.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoReadController", value = "/todo/read")
@Log4j2
public class TodoReadController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("read get...");

        // 사용자 요청 tno 받기
        String tno = request.getParameter("tno");
        
        // Service 용청한 tno로 할일 목록을 검색해서 결과 -> TodoDTO로 반환
        request.setAttribute("todo", TodoService.getInstance().getTodo(Integer.parseInt(tno)));

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/read.jsp");
        dispatcher.forward(request, response);

    }

}
