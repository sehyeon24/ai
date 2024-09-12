-- 주석처리(띄어쓰기까지)
-- ''만 사용, ""은 별칭 입력시에만
-- 데이터는 대소문자 구분 / 입력은 대소문자 구분X
-- 명령어 옆에 주석 달 수 없음

-- [II] SELECT 문 - 조회

-- 1. SELECT 문장 작성법 (실행 : CTRL+ENTER / 블럭잡고+F9)
SHOW USER;
SELECT * FROM TAB;  -- 현 계정이 갖고 있는 테이블들 정보
SELECT * FROM EMP;  -- EMP테이블의 모든 열(필드), 모든 행을 출력
SELECT * FROM DEPT; -- DEPT테이블의 모든 열, 모든 행 출력
SELECT * FROM SALGRADE;
-- 날짜 표기법 세팅(RR/MM/DD)
ALTER SESSION SET NLS_DATE_FORMAT ='RR/MM/DD';

-- 2. 특정 열만 출력
DESC EMP;
    -- EMP 테이블 구조
SELECT EMPNO, ENAME, SAL, JOB FROM EMP;     -- EMP테이블의 EMPNO, ENAME, SAL, JOB 특정 필드만 모든 행
SELECT EMPNO, ENAME, COMM FROM EMP;
SELECT EMPNO AS "사 번", ENAME AS "이 름", SAL AS "급 여" FROM EMP;   -- 필드명에 별칭을 사용
SELECT EMPNO "사 번", ENAME "이 름", SAL "급 여" FROM EMP;            -- AS 생략가능
SELECT EMPNO 사번, ENAME 이름, SAL 급여 FROM EMP;                     -- 별칭에 SPACE가 없는 경우 "" 생략가능
SELECT EMPNO NO, ENAME NAME, SAL SALARY FROM EMP;
SELECT EMPNO "NO", ENAME "NAME", SAL "SALARY" FROM EMP;

--- 3. 특정 행만 출력 : WHERE절(조건절)   -- 비교연산자 : 같다(=), 다르다(!=, ^= <>), <, <=, >, >=
SELECT EMPNO 사번, ENAME 이름, SAL 급여 FROM EMP WHERE SAL=3000;
SELECT * FROM EMP WHERE SAL<>3000;  -- SAL이 3000이 아닌 사람 모두 출력
SELECT * FROM EMP WHERE SAL!=3000;
SELECT * FROM EMP WHERE SAL^=3000;
    -- 비교연산자는 숫자, 문자, 날짜형 모두 가능
    -- (아스키코드에 의해) 'A' < 'AA' < 'AAA' < 'AAAA' < 'AAAB' < 'B' < 'a'
    -- EX1. 사원 이름이 'A', 'B', 'C'로 시작하는 사원의 모든 필드를 출력하시오. (D보다 작은)
    SELECT * FROM EMP WHERE ENAME < 'D';
    -- EX2. 81년도 이전에 입사한 사원의 모든 필드를 출력하시오. (81년도보다 작은)
    SELECT * FROM EMP WHERE HIREDATE < TO_DATE('81/01/01', 'RR/MM/DD');  -- '81'만 입력하면 문자열로 인식
                                        -- TO_DATE 어떤 양식에도 날짜 출력 가능
    ALTER SESSION SET NLS_DATE_FORMAT ='RR/MM/DD';
    
-- 4. 조건 절에 논리연산자 : AND, OR, NOT
    -- EX1. 급여(SAL)가 2000이상 3000이하인 직원의 모든 필드를 출력하시오.
    SELECT * FROM EMP WHERE SAL >=2000 AND SAL <=3000;
        -- SELECT * FROM EMP WHERE 2000 <= SAL <=3000; 사용X
        
    -- EX2. 82년도에 입사한 사원의 모든 필드(82/01/01이상 82/12/31이하)를 출력하시오.
    SELECT * FROM EMP WHERE HIREDATE >= '82/01/01' AND HIREDATE <= '82/12/31';
    
    -- EX3. 연봉(SAL*12)이 2400이상인 직원의 ENAME, SAL, 연봉(ANNUALSAL)을 출력하시오.
    SELECT ENAME, SAL, SAL*12 "연봉"   -- (3)순서 
        FROM EMP                      -- (1)순서
        WHERE SAL*12 >= 2400         -- (2)순서    WHERE절에는 필드의 별칭 사용 불가능
        ORDER BY SAL*12;            -- (4)순서     ORDER절에는 필드의 별칭 사용 가능
        
    -- EX4. 10번 부서(DEPTNO)이거나 JOB이 MANAGER인 직원의 모든 필드를 출력하시오.
    SELECT * FROM EMP WHERE DEPTNO=10 OR JOB='MANAGER';
    
    -- EX5. 10번 부서가 아닌 직원의 모든 필드를 출력하시오.
    SELECT * FROM EMP WHERE DEPTNO != 10;
    SELECT * FROM EMP WHERE NOT DEPTNO = 10;
    
-- 5. 산술연산자(SELECT절, WHERE절, ORTHER BY절)

SELECT EMPNO, ENAME, SAL, SAL*1.1 UPGRADESAL FROM EMP;      -- 10프로 인상
    -- EX. 모든 사원의 ENAME, SAL(급여), COMM(상여), 연봉(SAL*12+COMM)을 출력하시오.
    SELECT ENAME, SAL, COMM, SAL*12+COMM 연봉 FROM EMP;   -- 산술연산결과는 NULL을 포함하면 결과도 NULL
    -- NVL(NULL일 수도 있는 값, NULL이면 대체할 값) : NULL일 수도 있는 값과 NULL이면 대체할 값의 타입이 일치해야 함
    SELECT ENAME, SAL, COMM, SAL*12+NVL(COMM, 0) FROM EMP;       -- alias 없음
    SELECT ENAME, SAL, COMM, SAL*12+NVL(COMM, 0) 연봉 FROM EMP;   -- alias 있음
    
    -- MGR이 NULL이면 'CEO'라고 출력하시오.
    SELECT EMPNO, ENAME, MGR FROM EMP;  -- MGR:상사
    DESC EMP;













        
        
        
        
        