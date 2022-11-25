package com.app.manager.service.emp;

import com.app.manager.domain.EmpDTO;
import com.app.manager.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpListService {

    @Autowired(required = false)
    private EmpMapper empMapper;

    public List<EmpDTO> getEmpList(){
        return empMapper.selectAll();
    }

    @Service
    public static class EmpReadService {
    }
}
