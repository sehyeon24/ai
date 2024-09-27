--========================================================================================================================================================================
-- 2. SELECT
-- 1. EMP 테이블에서 sal이 3000이상인 사원의 empno, ename, job, sal을 출력
SELECT EMPNO, ENAME, JOB, SAL 
    FROM EMP 
    WHERE SAL >= 3000;
-- 2. EMP 테이블에서 empno가 7788인 사원의 ename과 deptno를 출력
SELECT ENAME, DEPTNO 
    FROM EMP 
    WHERE EMPNO = 7788;
-- 3. 연봉(SAL*12+COMM)이 24000 이상인 사번, 이름, 급여 출력 (급여순정렬)
SELECT EMPNO, ENAME, SAL 
    FROM EMP 
    WHERE SAL*12 + NVL(COMM, 0) >= 2400 
    ORDER BY SAL;
-- ★ 4. 입사일이 1981년 2월 20과 1981년 5월 1일 사이에 입사한 사원의 이름, 직책, 입사일을 출력 (단 hiredate 순으로 출력)
SELECT ENAME, JOB, HIREDATE 
    FROM EMP 
    WHERE HIREDATE BETWEEN '81/02/20' AND '81/05/01' 
    ORDER BY HIREDATE;
-- 5. deptno가 10,20인 사원의 모든 정보를 출력 (단 ename순으로 정렬)
SELECT * FROM EMP 
    WHERE DEPTNO IN (10, 20) 
    ORDER BY ENAME;
-- ★ 6. sal이 1500이상이고 deptno가 10,30인 사원의 ename과 sal를 출력(단 TITLE을 employee과 Monthly Salary로 출력)
SELECT ENAME "EMPLOYEE", SAL "MONTHLY SALARY"
    FROM EMP
    WHERE SAL > =1500 AND DEPTNO IN (10, 30);
-- 7. hiredate가 1982년인 사원의 모든 정보를 출력
SELECT * FROM EMP WHERE HIREDATE LIKE '82/%';
-- 8. 이름의 첫자가 C부터 P로 시작하는 사람의 이름, 급여 출력(이름순 정렬)
SELECT ENAME, SAL
    FROM EMP
    WHERE ENAME >= 'C' AND ENAME < 'Q'
    ORDER BY ENAME;
-- 9. comm이 sal보다 10%이상 많은 모든 사원에 대하여 이름, 급여, 상여금을 출력
SELECT ENAME, SAL, COMM
    FROM EMP
    WHERE COMM > SAL*1.1;
-- 10. job이 CLERK이거나 ANALYST이고 sal이 1000,3000,5000이 아닌 모든 사원의 정보를 출력
SELECT * FROM EMP
    WHERE JOB IN ('CLERK', 'ANALYST')
        AND SAL NOT IN (1000, 3000, 5000);
-- 11. ename에 L이 두 자가 있고 deptno가 30이거나 또는 mgr이 7782인 사원의 모든 정보를 출력
SELECT * FROM EMP
    WHERE ENAME LIKE '%L%L%' AND DEPTNO = 30 OR MGR = 7782;
-- ★ 12. 입사일이81년이고 업무가 'SALESMAN'이 아닌 직원의 사번, 사원명, 입사일, 업무, 급여를 출력.
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL
    FROM EMP
    WHERE HIREDATE LIKE '81/%' AND JOB != 'SALESMAN';
-- 13. 사번, 사원명, 입사일, 업무, 급여를 급여가 높은 순으로 정렬하고, 급여가 같으면 입사일이 빠른 사원으로 정렬하여 출력
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL
    FROM EMP
    ORDER BY SAL DESC, HIREDATE;
-- ★ 14. 사원명의 세 번째 알파벳이 ＇N＇인 사원의 사번, 사원명을 출력
SELECT EMPNO, ENAME
    FROM EMP
    WHERE ENAME LIKE '__N%';
-- ★ 15. 사원명에 ‘A’가 들어간 사원의 사번, 사원명을 출력
SELECT EMPNO, ENAME
    FROM EMP
    WHERE ENAME LIKE '%A%';
-- 16. 연봉(SAL*12)이 35000 이상인 사번, 사원명, 연봉을 검색
SELECT EMPNO, ENAME, SAL*12 연봉
    FROM EMP
    WHERE SAL*12 >= 35000;

--========================================================================================================================================================================   
-- 3. JOIN
-- 예제PART1
-- 1. EMP테이블의 모든 사원에 대해 사원명, 부서번호 부서명을 출력하시오.
SELECT ENAME, E.DEPTNO, DNAME
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO;
-- 2. EMP테이블에서 NEW YORK에서 근무하고 있는 사원에 대해 사원명, 직책, 급여, 부서명을 출력하시오.
SELECT ENAME, JOB, SAL, DNAME
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND LOC = 'NEW YORK';
-- ★ 3. EMP테이블에서 상여(COMM)를 받는 사원에 대해 사원명, 부서명, 위치를 출력하시오.
SELECT ENAME, COMM, DNAME, LOC
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND COMM >0;
-- ★ 4. EMP테이블에서 사원명에 알파벳 L이 있는 사원에 대해 사원명, 직책, 부서명, 근무지를 출력하시오.
SELECT ENAME, JOB, DNAME, LOC
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND ENAME LIKE '%L%';
-- 5. EMP테이블에서 사번, 사원명, 부서번호, 부서명을 출력하되 사원명 알파벳 순으로 출력하시오.
SELECT EMPNO, ENAME, D.DEPTNO, DNAME
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
    ORDER BY ENAME;
-- 6. 급여가 2000이상인 사원에 대해 사번, 사원명, 급여, 부서명을 급여기준으로 내림차순 정렬하여 출력하시오.
SELECT EMPNO, ENAME, SAL, DNAME
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND SAL >= 2000
    ORDER BY SAL DESC;
-- 7. 직책이 MANAGER이며 급여가 2500이상인 사원에 대해 사번, 사원명, 직책, 급여, 부서명을 사번 기준으로 오름차순 정렬하여 출력하시오.
SELECT EMPNO, ENAME, JOB, SAL, DNAME
    FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
        AND JOB = 'MANAGER' AND SAL >= 2500
    ORDER BY EMPNO;
-- ★ 8. 사번, 사원명, 직책, 급여, 급여등급을 급여기준으로 내림차순 정렬하여 출력하시오
SELECT EMPNO, ENAME, JOB, SAL, GRADE
    FROM EMP, SALGRADE
    WHERE SAL BETWEEN LOSAL AND HISAL
    ORDER BY SAL DESC;
-- 예제 PART2
-- 1. EMP테이블의 모든 사원에 대해 사원명과 직속상사명을 출력하시오.
SELECT W.ENAME, M.ENAME MANAGER
    FROM EMP W, EMP M
    WHERE W.MGR = M.EMPNO;
-- 2. 상사가 있는 직원에 대해 사원명, 급여, 직책, 직속상사명을 출력하시오.
SELECT W.ENAME, W.SAL, W.JOB, M.ENAME MANAGER
    FROM EMP W, EMP M
    WHERE W.MGR = M.EMPNO;
-- 3. 상사가 없는 직원과 상사가 있는 직원들 모두에 대해 사원명, 급여, 직책, 직속상사명을 출력하시오.
SELECT W.ENAME, W.SAL, W.JOB, NVL(M.ENAME, '없음') MANAGER
    FROM EMP W, EMP M
    WHERE W.MGR = M.EMPNO(+);
-- 4. 상사가 있는 직원에 대해 사원명, 사원명, 급여, 부서명, 직속상사명을 출력하시오.
SELECT W.ENAME, W.SAL, DNAME, M.ENAME MANAGER
    FROM EMP W, DEPT D, EMP M
    WHERE W.DEPTNO = D.DEPTNO
        AND W.MGR = M.EMPNO;
-- ★ 5. 상사가 없는 직원과 상사가 있는 직원 모두에 대해 사원명, 급여, 부서코드, 부서명, 근무지, 직속상사명을 출력하시오.(단, 직속상사가 없을 경우 직속상사명에는 ‘없음’으로 대신 출력하시오.)
SELECT W.ENAME, W.SAL, W.DEPTNO, DNAME, LOC, NVL(M.ENAME, '없음') MANAGER
    FROM EMP W, DEPT D, EMP M
    WHERE W.DEPTNO = D.DEPTNO AND W.MGR = M.EMPNO(+);
-- 6. 급여가 2000이상인 사원에 대해 사원명, 급여, 급여등급, 부서명, 직속상사명을 출력하시오.
SELECT W.ENAME, W.SAL, GRADE, DNAME, M.ENAME MANAGER
    FROM EMP W, SALGRADE, DEPT D, EMP M
    WHERE W.DEPTNO = D.DEPTNO AND W.SAL BETWEEN LOSAL AND HISAL AND W.MGR = M.EMPNO
        AND W.SAL >= 2000;
-- 7. 상사가 있는 직원과 상사가 없는 직원 모두에 대해 사원명, 급여, 급여등급, 부서명, 직속상사명을 부서명 알파벳 순으로 정렬하여 출력하시오.
SELECT W.ENAME, W.SAL, GRADE, DNAME, M.ENAME MANAGER
    FROM EMP W, SALGRADE, DEPT D, EMP M
    WHERE W.DEPTNO = D.DEPTNO 
        AND W.SAL BETWEEN LOSAL AND HISAL 
        AND W.MGR = M.EMPNO(+)
    ORDER BY DNAME;
-- 8. 사원명, 급여, 급여등급, 부서명, 연봉, 직속상사명을 출력하시오. 단 연봉은 (SAL+COMM)*12로 계산한다.
SELECT W.ENAME, W.SAL, GRADE, DNAME, (W.SAL+NVL(W.COMM, 0))*12 ANNUALSAL, M.ENAME MANAGER
    FROM EMP W, DEPT D, SALGRADE, EMP M
    WHERE W.DEPTNO = D.DEPTNO
        AND W.SAL BETWEEN LOSAL AND HISAL
        AND W.MGR = M.EMPNO;
-- 9. 위 8번을 부서명 알파벳 순으로 정렬하고 부서명이 같으면 급여가 큰 사원에서 작은 사원 순으로 정렬하여 출력하시오.
SELECT W.ENAME, W.SAL, GRADE, DNAME, (W.SAL+NVL(W.COMM, 0))*12 ANNUALSAL, M.ENAME MANAGER
    FROM EMP W, DEPT D, SALGRADE, EMP M
    WHERE W.DEPTNO = D.DEPTNO
        AND W.SAL BETWEEN LOSAL AND HISAL
        AND W.MGR = M.EMPNO
    ORDER BY DNAME, SAL DESC;
-- 10. 사원테이블에서 사원명, 사원의 상사를 검색하시오(상사가 없는 직원까지 전체).
SELECT W.ENAME, M.ENAME
    FROM EMP W, EMP M
    WHERE W.MGR = M.EMPNO(+);
-- 11. 사원명, 상사명, 상사의 상사명을 검색하시오
SELECT W.ENAME, M.ENAME, MM.ENAME
    FROM EMP W, EMP M, EMP MM
    WHERE W.MGR = M.EMPNO
        AND M.MGR = MM.EMPNO;
--12. 위11번의 결과에서 상위 상사가 없는 모든 직원의 이름도 출력되도록 수정하시오.
SELECT W.ENAME, M.ENAME, MM.ENAME
    FROM EMP W, EMP M, EMP MM
    WHERE W.MGR = M.EMPNO(+)
        AND M.MGR = MM.EMPNO(+);
        
--========================================================================================================================================================================
-- 4. 단일행 함수
-- <총 연습문제>
-- ★ 1. 현재 날짜를 TITLE에 Current Date로 별칭으로 출력하는 SELECT 문장을 기술하시오.

-- 2. EMP 테이블에서 현재 급여에 15%가 증가된 급여를 사원번호,이름,업무,급여,증가된 급여(New Salary),증가액(Increase)를 출력하는 SELECT 문장을 기술하시오.
-- 3. EMP 테이블에서 이름,입사일,입사일로부터 6개월 후 돌아오는 월요일 구하여 출력하는 SELECT 문장을 기술하시오.
-- 4. EMP 테이블에서 이름,입사일, 입사일로부터 현재까지의 월수,급여, 입사일부터 현재까지의 급여의 총계를 출력하는 SELECT 문장을 기술하시오.
-- 5. EMP 테이블에서 모든 사원의 이름과 급여(15자리로 출력 좌측의 빈 곳은 “*”로 대치)를 출력하는 SELECT 문장을 기술하시오.
-- 6. EMP 테이블에서 모든 사원의 정보를 이름,업무,입사일,입사한 요일을 출력하는 SELECT 문장을 기술하시오.
-- 7. EMP 테이블에서 이름의 길이가 6자 이상인 사원의 정보를 이름,이름의 글자수,업무를 출력하는 SELECT 문장을 기술하시오.
-- 8. EMP 테이블에서 모든 사원의 정보를 이름, 업무, 급여, 보너스, 급여+보너스를 출력하는 SELECT 문장을 기술하시오.
-- 9. 사원 테이블의 사원명에서 2번째 문자부터 3개의 문자를 추출하시오. 
-- 10. 사원 테이블에서 입사일이 12월인 사원의 사번, 사원명, 입사일을 검색하시오 (EXTRACT함수, TO_CHAR함수)
-- 11. 다음과 같은 결과를 검색할 수 있는 SQL 문장을 작성하시오.
-- EMPNO ENAME 급여
-- 7369 SMITH *******800
-- 7499 ALLEN ******1600
-- 7521 WARD ******1250
-- …….
-- 12. 다음과 같은 결과를 검색할 수 있는 SQL 문장을 작성하시오.
-- EMPNO ENAME 입사일
-- 7369 SMITH 1980-12-17
-- ….
-- ★ 13. 사원 테이블에서 부서번호가 20인 사원의 사번, 이름, 직무, 급여를 출력하시오(급여는 앞에 $를 삽입하고 3자리마다 ,를 출력한다.

--========================================================================================================================================================================
-- 5. 그룹함수 (??)
-- ★ 1. 인원수,최대 급여,최소 급여,급여의 합을 출력
-- 2. 업무별 인원수를 구하여 출력
-- 3. 최고 급여와 최소 급여의 차이는 얼마인가 출력
-- 4. 각 부서별로 인원수, 급여 평균, 최저 급여, 최고 급여, 급여의 합을 출력(급여의 합이 많은 순으로)
-- 5. 부서별, 업무별 그룹하여 결과를 부서번호, 업무, 인원수, 급여의 평균, 급여의 합을 출력(부서번호, 업무순으로 오름차순 정렬)
-- 6. 업무별, 부서별 그룹하여 결과를 업무, 부서번호, 인원수, 급여의 평균, 급여의 합을 출력(출력결과는 업무순, 부서번호 순 오름차순 정렬)
-- 7. 사원수가 5명이상 넘는 부서번호와 사원수를 출력
-- ★ 8. 사원수가 5명이상 넘는 부서명과 사원수를 출력
-- 9. 업무별 급여의 평균이 3000이상인 업무에 대해서 업무명, 평균 급여, 급여의 합을 출력
-- 10. 급여 합이 5000을 초과하는 각 업무에 대해서 업무와 급여합을 출력(급여 합계순 내림차순 정렬)
-- 11. 부서별 급여평균, 부서별 급여합계, 부서별 최소급여를 출력
-- 12. 위의 11번에서 나온, 부서별 급여평균들 최대치, 부서별 급여합들의 최대치, 부서별 최소급여들의 최대치를 출력하시오.
-- 13. 사원 테이블에서 아래의 결과를 출력.
-- YEAR COUNT(*) MIN(SAL) MAX(SAL) AVG(SAL) SUM(SAL)
-- 80      1       800      800      800      800
-- 81     10       950     5000     2282.5   2282.5
-- 82      2      1300     3000     2150     4300
-- 83      1      1100     1100     1100     1100
-- 14. 아래의 결과를 출력(입사년도별 사원수)
-- 1980 사원수
-- 1981 10
-- 1982 2
-- 1983 1
--TOTAL 14
-- 15. 최대급여, 최소급여, 전체급여합, 평균을 출력
-- 16. 부서별 인원수 출력
--17. 부서별 인원수가 6명이상인 부서번호 출력


--========================================================================================================================================================================
-- 6. SUBQUERY
--1. 사원테이블에서 가장 먼저 입사한 사람의 이름, 급여, 입사일
-- 2. 회사에서 가장 급여가 적은 사람의 이름, 급여
-- 3. 회사 평균보다 급여를 많이 받는 사람의 이름, 급여, 부서코드
--4. 회사 평균 이하의 급여를 받는 사람의 이름, 급여, 부서명
--5. SCOTT보다 먼저 입사한 사람의 이름, 급여, 입사일, 급여 등급
--6. 5번(SCOTT보다 먼저 입사한 사람의 이름, 급여, 입사일, 급여 등급)에 부서명 추가하고 급여가 큰 순 정렬
--7. BLAKE 보다 급여가 많은 사원들의 사번, 이름, 급여
--8. MILLER보다 늦게 입사한 사원의 사번, 이름, 입사일
--9. 사원전체 평균 급여보다 급여가 많은 사원들의 사번, 이름, 급여
--10. CLARK와 같은 부서번호이며, 사번이 7698인 직원의 급여보다 많은 급여를 받는 사원들의 사번, 이름, 급여
--11. CLARK와 같은 부서명이며, 사번이 7698인 직원의 급여보다 많은 급여를 받는 사원들의 사번, 이름, 급여
--12. BLAKE와 같은 부서에 있는 모든 사원의 이름과 입사일자
--13. 평균 급여 이상을 받는 모든 종업원에 대해서 사원번호와 이름 단 급여가 많은 순으로 출력)
-- 14. 이름에 “T”가 있는 사원이 근무하는 부서에서 근무하는 모든 직원의 사원 번호,이름,급여(단 사번 순 출력)
-- 15. 부서 위치가 Dallas인 모든 종업원에 대해 이름,업무,급여
-- ★ 16. EMP 테이블에서 King인 사원의 직속부하의 이름과 급여
-- 17. SALES부서 사원의 이름, 업무
-- 18. 월급이 부서 30의 최저 월급보다 높은 사원의 모든 필드
-- 19. FORD와 업무도 월급도 같은 사원의 모든 필드
-- 20. 이름이 JONES인 직원의 JOB과 같거나 FORD의 SAL 이상을 받는 사원의 정보를 이름, 업무, 부서번호, 급여
-- 단, 업무별 알파벳 순, 월급이 많은 순으로 출력
-- 21. SCOTT 또는 WARD와 월급이 같은 사원의 정보를 이름,업무,급여
-- 22. CHICAGO에서 근무하는 사원과 같은 업무를 하는 사원들의 이름,업무
-- ★ 23. 부서별 평균 월급보다 높은 사원을 사번, 이름, 급여
-- ★ 24. 업무별 평균 월급보다 적은 월급을 받는 사원을 부서번호, 이름, 급여
-- 25. 적어도 한 명 이상으로부터 보고를 받을 수 있는 사원을 업무, 이름, 사번, 부서번호를 출력(단, 부서번호 순으로 오름차순 정렬)
-- 26. 말단 사원의 사번, 이름, 업무, 부서번호



--========================================================================================================================================================================
-- 7. DDL, DML
-- ◆ DDL 연습문제 page1
-- • 다음과 같은 구조로 SAM01테이블을 생성하시오. 같은 이름의 테이블이 존재할 경우 DROP TABLE로 삭제 후 생성하시오
-- – SAM01의 구조 (EMPNO를 주키로)
-- • EMPNO(사번) – NUMBER(4)
-- • ENAME(이름) – VARCHAR2(10)
-- • JOB(직책) – VARCHAR2(9)
-- • SAL(급여) – NUMBER(7,2)
-- • EMP 에 저장된 사원 중 10번 부서 소속 사원의 정보를 추가한다
-- EMPNO ENAME   JOB    SAL
-- 1000  APPLE POLICE  10000
-- 1010 BANANA  NURSE  15000
-- 1020 ORANGE DOCTOR  25000
-- 1030  VERY  (NULL)  25000
-- 1040  CAT   (NULL)   2000
-- 7782 CLARK  MANAGER  2450
-- 7839  KING PRESIDENT 5000
-- 7934 MILLER  CLERK   1300

-- ◆DDL 연습문제 page2
-- 1. 아래의 구조를 만족하는 MY_DATA 테이블을 생성하시오. 단 ID가 PRIMARY KEY이다.
-- ID - number(4) NAME - varchar2(10) USERID - varchar2(30) SALARY - number(10,2)
--          1            Scott                  sscott          10,000.00
--          2            Ford                   fford           13,000.00
--          3            Patel                  ppatel          33,000.00
--          4            Report                 rreport         23,500.00
--          5            Good                   ggood           44,450.00
-- 2. 생성된 테이블에 위의 도표와 같은 값을 입력하는 SQL문을 작성하시오.
-- 3. TO_CHAR 내장 함수를 이용하여 입력한 자료를 위의 도표와 같은 형식으로 출력하는 SQL문을 작성하시오.
-- 4. 자료를 영구적으로 데이터베이스에 등록하는 명령어를 작성하시오.
-- 5. ID가 3번인 사람의 급여를 65000.00으로 갱신하고 영구적으로 데이터베이스에 반영하라.
-- 6. NAME이 Ford인 사람을 삭제하고 영구적으로 데이터베이스에 반영하라.
-- 7. SALARY가 15,000.00 이하인 사람의 급여를 15,000.00으로 변경하라
-- 8. 위에서 생성한 테이블을 삭제하라.

-- ◆ DML 연습문제 page3
-- 1. EMP 테이블과 같은 구조와 같은 내용의 테이블 EMP01을 생성(테이블이 있을시 제거한 후)하고, 모든 사원의 부서번호를 30번으로 수정합니다.
-- 2. EMP01테이블의 모든 사원의 급여를 10% 인상시키는 UPDATE문을 작성
-- ★ 3. 급여가 3000이상인 사원만 급여를 10%인상
-- 4. EMP01테이블에서 ‘DALLAS’에서 근무하는 직원들의 연봉을 1000인상
-- ★ 5. SCOTT사원의 부서번호는 20번으로, 직급은 MANAGER로 한꺼번에 수정
-- 6. 부서명이 SALES인 사원을 모두 삭제하는 SQL작성
-- ★ 7. 사원명이 ‘FORD’인 사원을 삭제하는 SQL 작성
-- 8. SAM01 테이블에서 JOB이 NULL인 사원을 삭제하시오
-- 9. SAM01테이블에서 ENAME이 ORANGE인 사원을 삭제하시오
-- 10. 급여가 1500이하인 사람의 급여를 1500으로 수정
-- ★ 11. JOB이 ‘MANAGER’인 사원의 급여를 10%인하하시오
-- • ERD 설계를 보고 제약조건에 맞는 테이블을 생성하는 DDL문을 작성하고 아래의 표와 같이 출력하는 SQL문을 작성하시오
-- (훈련생성명_SQL활용.sql)
-- ✓ BOOK : 출판년은 DEFAULT 값으로 현재 입력받는 년도가 입력되도록 한다.
-- ✓ BOOKCATEGORY CATEGORY_NAME은 UNIQUE
-- ✓ BOOKCATEGORY : OFFICE_LOC 은 NOT NUL
-- 테이블명 : BOOKCATEGORY
-- CATEGORY CODE(PK)    CATEGORY    NAME OFFICE_LOC
--       100              철학         3층 인문실
--       200              인문         3층 인문실
--       300             자연과학       4층 과학실
--       400               IT          4층 과학실
-- 테이블명 : BOOK
-- CATEGORY CODE(책분류)   bookNO(PK:책No)  bookNAME(책이름)   PUBLISHER(출판사)  PUBYEAR(출판년)
--         100               100A01          철학자의 삶           이젠출판           2021
--         400               400A01          이것이DB다            다음출판           2022
-- 책번호   책이름     출판사  출판년도 책분류   사무실
-- 100A01 철학자의 삶 이젠출판  2021    철학  3층 인문실
-- 400A01 이것이DB다  다음출판  2022    IT   4층 과학실
-- • 테이블을 삭제 후 생성하고, 데이터를 입력한 후, 아래 조건에 맞게 출력하는 sql문을 작성하시오 (훈련생성명_SQL활용.sql)
-- ✓ STUDENT : SCORE 은 0점 이상 100점 이하
-- 학번 이름  점수 학과코드   학과명   학과사무실
-- 101 홍길동  99   1     컴퓨터공학   A101호
-- 102 신길동 100   2      빅데이터    A102호
