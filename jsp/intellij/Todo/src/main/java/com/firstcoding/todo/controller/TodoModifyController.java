package com.firstcoding.todo.controller;

import com.firstcoding.todo.dao.TodoDao;
import com.firstcoding.todo.domain.OldTodoDTO;
import com.firstcoding.todo.domain.TodoDTO;
import com.firstcoding.todo.service.TodoService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "TodoModifyController", value = "/todo/modify")
@Log4j2
public class TodoModifyController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("modify get ...");

        // 사용자가 입력했던 데이터를 기본값으로 가지는 입력 폼 화면
        String tno = request.getParameter("tno");

        // 수정 할 할일의 번호 받아서 Service에게  전달 -> TodoDTO 받는다
        request.setAttribute("todo", TodoService.getInstance().getTodo(Long.parseLong(tno)));

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/modify.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("modify post ...");

        // 사용자 입력한 데이터 모두 받기
        request.setCharacterEncoding("utf-8");
        String tno = request.getParameter("tno");
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");
        String finished = request.getParameter("finished");

        // Service로 보낼 DTO 생성
        TodoDTO todoDTO = TodoDTO.builder()
                .tno(Long.parseLong(tno))
                .todo(todo)
                .dueDate(LocalDate.parse(dueDate))
                .finished(finished == null ? false : true)
                .build();
        log.info(todoDTO);

        TodoService.getInstance().modify(todoDTO);

        response.sendRedirect("/todo/list");
    }
}
