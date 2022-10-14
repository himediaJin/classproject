SELECT DEPTNO, COUNT(*) AS "사원 수", ROUND(AVG(SAL)) AS "부서 평균 급여"
FROM EMP
GROUP BY DEPTNO
ORDER BY AVG(SAL);





SELECT DECODE(DEPTNO, 10, 'ACCOUNTING',
                      20, 'RESEARCH',
                      30, 'SALES',
                      40, 'OPERATIONS'
       ) AS DNAME,
       DECODE(DEPTNO, 10, 'NEW YORK',
                      20, 'DALLAS',
                      30, 'CHICAGO',
                      40, 'BOSTON'
       ) AS LOC,
       COUNT(*) AS "사원 수", ROUND(AVG(SAL)) AS "부서 평균 급여"
FROM EMP
GROUP BY DEPTNO
ORDER BY AVG(SAL);

SELECT JOB, DEPTNO,
	   -- if(조건, true, false)
       if(DEPTNO=10, SUM(SAL), null) AS "부서10",
       if(DEPTNO=20, SUM(SAL), null) AS "부서20",
       if(DEPTNO=30, SUM(SAL), null) AS "부서30",
        SUM(SAL)
FROM EMP
GROUP BY JOB, DEPTNO
ORDER BY DEPTNO;




