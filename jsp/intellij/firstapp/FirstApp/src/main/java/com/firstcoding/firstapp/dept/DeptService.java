package com.firstcoding.firstapp.dept;

import com.firstcoding.firstapp.util.ConnectionUtil;

import java.util.List;

public class DeptService {

    private DeptDao dao = new DeptDao();

    public List<Dept> getList() throws  Exception{
        List<Dept> list = dao.seletAll(ConnectionUtil.getInstance().getConnection());
        return list;
    }

}
