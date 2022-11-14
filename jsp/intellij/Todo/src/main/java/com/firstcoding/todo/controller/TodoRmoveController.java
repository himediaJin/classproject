package com.firstcoding.todo.controller;

import com.firstcoding.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoRmoveController", value = "/todo/remove")
@Log4j2
public class TodoRmoveController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("todo remove ...");

        // 삭제하고자 하는 todo의 tno 값을 받는다
        String tno = request.getParameter("tno");

        // Service 로 tno 전달 -> Dao 해당 로우 삭제
        TodoService.getInstance().deleteBytno(Long.parseLong(tno));

        response.sendRedirect("/todo/list");
    }
}
