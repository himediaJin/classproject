package com.firstcoding.firstapp.dept;

import com.firstcoding.firstapp.util.ConnectionUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeptDaoTest {

    private Connection conn;

    @BeforeEach
    void setUp() throws Exception {
        conn = ConnectionUtil.getInstance().getConnection();
    }

    @AfterEach
    void tearDown() throws SQLException {
        conn.close();
    }

    @Test
    void seletAll() throws SQLException {

        DeptDao dao = new DeptDao();

        List<Dept> list = dao.seletAll(conn);

        for (Dept dept: list) {
            System.out.println(dept);
        }

        Assertions.assertEquals(5, list.size(), "개수 체크 4개이어야 함 : ");


    }
}