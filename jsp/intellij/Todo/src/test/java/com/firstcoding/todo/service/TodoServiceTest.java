package com.firstcoding.todo.service;

import com.firstcoding.todo.dao.TodoDao;
import com.firstcoding.todo.dao.TodoDaoImpl;
import com.firstcoding.todo.domain.TodoDTO;
import com.firstcoding.todo.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class TodoServiceTest {

    private TodoDao todoDao;
    private Connection conn;

    @BeforeEach
    void setUp() throws Exception {
        todoDao = new TodoDaoImpl();
        conn = ConnectionProvider.getInstance().getConnection();
    }

    @AfterEach
    void tearDown() throws SQLException {
        conn.close();
    }

    @Test
    void getTodoList() throws SQLException {

        List<TodoDTO> list = todoDao.selectAll(conn);

        log.info(list);

    }
}