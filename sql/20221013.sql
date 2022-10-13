-- 20221013


-- 함수 : 단일행 함수, 집합 함수

select ename, sal, nvl(comm, 0) as comm1
from emp
where nvl(comm, 0) >= 0
;

-- 문자 함수

select lower('SCOTT') from dual;
select ename, lower(ename) from emp;

select Upper('scott') from dual;

select initcap('scott') from dual;

-- substr(원본, 시작포인트, 반환할 개수)
select substr('안녕하세요. 손흥민입니다.', 2, 8) from dual;
select substr('안녕하세요. 손흥민입니다.', 5) from dual;

select length('안녕하세요. 손흥민입니다.') from dual;

-- lpad, rpad 특정 자리수 지정하고 자리수에 데이터가 없는경우 특정 패턴으로 채우는 함수
--  00010, 00020, 00030, 00040
select dname, deptno, lpad(deptno, 5, '0'), rpad(deptno, 5, 'A')
from dept;


select '     ABC', trim('     ABC'), 'ABC          ', trim('ABC          '), '          ABC          ', trim('          ABC          ')
from dual;

Select replace('Steven King', 'Steven', 'S.'), replace('Steven King', 'Steven ', '')
from dual;





-- 숫자 함수

select -10, abs(-10)
from dual;

select 2.1, 2.9, floor(2.9)  
from dual;

select 1234.567, round(1234.527, 1), round(1235.527, -1), round(1235.527)
from dual;

select 1234.567, trunc(1234.567, 1), trunc(1235.567, -1), trunc(1234.567)
from dual;

select mod(1,3), mod(2,3), mod(3,3), mod(0,3), mod(3,0)
from dual;





-- 날짜 함수

-- 현재 날짜
select sysdate
from dual;

select months_between(sysdate, '21/12/13') from dual;
select add_months(sysdate, -6) from dual;
select next_day(sysdate, 2) from dual;
select last_day(sysdate) from dual;
select round(sysdate) from dual;
select trunc(sysdate) from dual;





-- 변환 함수