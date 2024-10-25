-- ch06_db프로젝트에서 쓸 query

-- ex1_emp
SELECT * FROM EMP;

-- ex2 : 입력받은 부서번호의 직원 정보를 출력
-- <select>태그 내에 보여질 부서정보들
SELECT * FROM DEPT; -- 6장
SELECT DEPTNO, DNAME FROM DEPT;     -- 7장
-- <option>10->10번 부서 직원들, ''->모든부서직원
SELECT E.*, DNAME
    FROM EMP E, DEPT D
    WHERE E.DEPTNO LIKE '%' || '10' AND E.DEPTNO = D.DEPTNO;
    
-- quiz : 사원명(일부 알파벳)으로 직원 검색 ('  s' 입력시 'S'가 들어간 직원 출력 / UPPER, TRIM 함수 적용
SELECT E.*, DNAME
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND ENAME LIKE '%' || TRIM(UPPER(' s')) || '%';   -- 연결연산자('%s%')
