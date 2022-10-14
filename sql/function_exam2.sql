-- 함수 문제 2

-- (3) 박지성의 총 구매액(박지성의 고객번호는 1번으로 놓고 작성)
SELECT SUM(SALEPRICE) AS TOTALPAY 
FROM ORDERS
WHERE CUSTID = 1;

-- (4) 박지성이 구매한 도서의 수(박지성의 고객번호는 1번으로 놓고 작성)
SELECT COUNT(*) AS COUNTBOOK
FROM ORDERS
WHERE CUSTID = 1;



-- (1) 마당서점 도서의 총 개수
SELECT COUNT(*) AS BOOKNUM
FROM BOOK;

-- (2) 마당서점에 도서를 출고하는 출판사의 총개수
SELECT COUNT(DISTINCT PUBLISHER) AS PUBNUM
FROM BOOK;