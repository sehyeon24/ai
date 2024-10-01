-- com.lec.ex1selectAll
SELECT * FROM EMP;

-- com.lec.ex2selectWhere
-- Ex1. 부서번호를 받아 부서정보 출력
SELECT * FROM DEPT WHERE DEPTNO = 10;
INSERT INTO DEPT VALUES (50, 'IT', '서울');
SELECT * FROM DEPT;
COMMIT;
-- EX2. 부서번호를 입력 받아 부서정보와 사원정보 출력
SELECT * FROM DEPT WHERE DEPTNO = 10;
SELECT W.EMPNO, W.ENAME, W.SAL, M.ENAME MANAGER
    FROM EMP W, EMP M
    WHERE W.MGR = M.EMPNO AND W.DEPTNO = 10;
-- EX3. 부서이름으로 부서정보 출력
SELECT * FROM DEPT WHERE UPPER(DNAME) = UPPER('SALES'); -- 대소문자 경우의 수 제거
SELECT * FROM DEPT WHERE DNAME = UPPER('SALES'); -- 대소문자 경우의 수 제거

-- ★ ★ ★ com.lec.ex3insert ★ ★ ★ 
SELECT COUNT(*) CNT FROM DEPT WHERE DEPTNO = 70;    -- 쿼리1
INSERT INTO DEPT 
    VALUES (70, UPPER('CS'), UPPER('PUSAN'));       -- 쿼리2
SELECT * FROM DEPT;
ROLLBACK;

-- ★ ★ ★ com.lec.ex4update ★ ★ ★ 
-- 부서번호 확인까지
SELECT * FROM DEPT WHERE DEPTNO = 80;
UPDATE DEPT 
    SET DNAME = UPPER('marketing'),
        LOC = UPPER('seoul')
    WHERE DEPTNO = 80;
COMMIT;
SELECT * FROM DEPT;

-- ★ ★ ★ com.lec.ex5delete ★ ★ ★ 
DELETE FROM DEPT WHERE DEPTNO = 99;

-- ★ ★ ★ com.lec.ex6prepareStatement ★ ★ ★ 
SELECT * FROM DEPT WHERE DNAME = UPPER('SALES');
SELECT EMPNO, ENAME, SAL
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND DNAME = UPPER('SALES') 
    ORDER BY SAL;







