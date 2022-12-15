package com.first.app.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

    @Query(value = "select e from Emp e join fetch e.dept")
    List<Emp> findEmpDept();

    @Query("select e from Emp e, Dept d where e.dept=d")
    Page<Emp> findEmpWithDept(Pageable pageable);


    // 게시물 리스트 => 제목 [12] <= 댓글의 개수
    // 게시물[dept] , count 사원 수
}
