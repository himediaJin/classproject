package com.app.manager.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmpDTO {

    private int empno;
    private String ename;
    private String job;
    private String mgr;
    private String hiredate;
    private double sal;
    private double comm;
    private int deptno;


}
