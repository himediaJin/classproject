
select empno, ename, job, dname, loc
from emp e join dept d
on e.deptno=d.deptno
where ename='SCOTT'
;



select ename, losal, sal, hisal, grade
from emp e join salgrade s
on e.sal between s.losal and s.hisal
;

select *
from emp, dept
;