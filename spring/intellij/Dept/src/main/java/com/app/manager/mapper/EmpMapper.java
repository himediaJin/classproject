package com.app.manager.mapper;

import com.app.manager.domain.DeptDTO;
import com.app.manager.domain.EmpDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    // 전체 사원 리스트
    @Select("select * from emp")
    List<EmpDTO> selectAll();

    // 수정 / 상세 페이지
    @Select("select * from emp where empno=#{empno}")
    EmpDTO selectByempno(int empno);

    // 수정(변경) 처리
    int updateEmp(EmpDTO empDTO);

    // 삭제
    int deleteByEmptno(int empno);

    // 입력
    @Insert("insert into emp values(#{empno},#{ename},#{job},#{mgr},#{hiredate},#{sal},#{comm},#{deptno})")
    int insertEmp(EmpDTO empDTO);
}
