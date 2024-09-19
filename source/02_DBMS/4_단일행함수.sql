-- [IV] 단일행함수
-- 함수 = 단일행함수(4장) + 그룹함수(5장)
SELECT HIREDATE, TO_CHAR(HIREDATE, 'YYYY-MM-DD HH24:MI:SS') FROM EMP;   -- 단일행 적용(포맷 변경)

SELECT SUM(SAL), AVG(SAL) FROM EMP;    -- 그룹함수(INPUT 14행 -> OUTPUT 1행)
-- SELECT DEPTNO, AVG(SAL) FROM EMP;       -- 싱글라인과 그룹라인 필드와 함께 적용 못함 그래서 밑에처럼 GROUP BY 사용
SELECT DEPTNO, AVG(SAL) FROM EMP GROUP BY DEPTNO;   -- INPUT N행 -> OUTPUT 1행

-- ★ 단일행함수 = 숫자관렴함수, 문자관련함수, 날짜관련함수, 형변환함수, NVL, etc...
-- 1. 숫자관련함수
    -- DUAL테이블 : 오라클에서 제공한 1행1열짜리 DUMMY TABLE
SELECT * FROM DUAL;
DESC DUAL;
SELECT FLOOR(SAL) FROM EMP;
SELECT FLOOR(34.567) FROM DUAL;         -- 소수점에서 내림(버림)
-- SELECT FLOOR(34.567*10)/10.0 FROM DUAL; -- 자바식
SELECT FLOOR(34.567*10)/10 FROM DUAL;   -- 345/10 => 34.5 : /10.0 안해도 됨
SELECT TRUNC(34.567, 1) FROM DUAL;      -- 소수점 한 자리에서 내림(버림)
SELECT TRUNC(34.567) FROM DUAL;
SELECT TRUNC(34.567, -1) FROM DUAL;     -- -1은 일의 자리에서 내림(버림)
    -- EX. EMP에서 이름, 급여를 출력하시오. (단, 십의 자리에서 내림)
    SELECT ENAME, SAL, TRUNC(SAL, -2) FROM EMP;
    
SELECT CEIL(34.567) FROM DUAL;          -- 소수점에서 올림

SELECT ROUND(34.567) FROM DUAL;         -- 소수점에서 반올림
SELECT ROUND(34.567, 2) FROM DUAL;      -- 소수점 두 자리에서 반올림
SELECT ROUND(34.567, -1) FROM DUAL;     -- 일의 자리에서 반올림

SELECT MOD(9,2) FROM DUAL;  -- 2/9의 나머지 출력됨
    -- 홀수년도에 입사한 사원의 모든 정보 출력
    SELECT * FROM EMP WHERE MOD( TO_CHAR(HIREDATE, 'RR'), 2) =1;
    
 -- 2. 문자관련함수
 -- (1) 대소문자 관련
SELECT UPPER('abcABC') FROM DUAL;  -- 대문자로
SELECT LOWER('abcABC') FROM DUAL;  -- 소문자로
SELECT INITCAP('welcome to oracle') FROM DUAL;  -- 어절 단위로 나눠서 첫 문자만 대문자로
SELECT INITCAP('WELCOME TO ORACLE') FROM DUAL;  -- 어절 단위로 나눠서 첫 문자만 대문자로
    -- EX. 이름이 SCOTT인 직원의 모든 필드를 출력하시오.
    SELECT * FROM EMP WHERE UPPER(ENAME) = 'SCOTT';  -- 소문자도 찾아줌
    SELECT * FROM EMP WHERE INITCAP(ENAME) = 'Scott';
    SELECT * FROM EMP WHERE LOWER(ENAME) = 'scott';
-- (2) 문자 연결(CONCAT함수, ||연산자)
SELECT 'AB'||'CD'||'EF'||'GH' FROM DUAL;
SELECT CONCAT('AB', 'CD') FROM DUAL;    -- 매개변수 두 개만 연결 가능
SELECT CONCAT( CONCAT('AB', 'CD'), CONCAT('EF', 'GH') ) FROM DUAL;    -- 매개변수 두 개 이상일 때
    -- "SMITH는 MANAGER다" 포맷으로 EMP테이블 데이터를 출력하시오.
    SELECT ENAME || '는' || JOB || '다' FROM EMP;
    SELECT CONCAT( CONCAT(ENAME, '는'), CONCAT(JOB, '다') ) FROM EMP;
-- (3) SUBSTR(STR, 시작위치, 문자갯수) : STR을 시작위치부터 문자갯수만큼 문자 추출
--    SUBSTRB(STR, 시작바이트위치, 바이트갯수) : STR을 시작위치부터 바이트갯수만큼 문자 추출
            -- O R A C L E
            -- 1 2 3 4 5 6
            ---6-5-7-3-2-1(-도 가능)
SELECT SUBSTR('ORACLE', 4, 2) FROM DUAL;    -- 4번째부터 2글자 추출
SELECT SUBSTRB('ORACLE', 4, 2) FROM DUAL;
            -- 영어는 한 글자 = 1BYTE
            -- 한글은 한 글자 = 3BYTE
SELECT SUBSTR('데이터베이스', 4, 2) FROM DUAL;
SELECT SUBSTRB('데이터베이스', 4, 2) FROM DUAL;   -- 이 자체가 3바이트이기 때문에 아무것도 나오지 않음
SELECT SUBSTRB('데이터베이스', 4, 3) FROM DUAL;
    -- EX. 9월에 입사한 사원의 모든 필드를 출력하시오. (날짜형 표기 'RR/MM/DD'로 출력)
    SELECT * FROM EMP WHERE SUBSTR(HIREDATE, 4, 2) = '09';  -- DATE(날짜)형도 가능
    DESC EMP;
    -- EX. 9일에 입사한 사원의 모든 필드를 출력하시오.
    SELECT * FROM EMP WHERE SUBSTR(HIREDATE, 7, 2) = '09';
    SELECT * FROM EMP WHERE SUBSTR(HIREDATE, -2, 2) = '09';
-- (4) LENGTH(STR) : STR의 글자수   
    -- LENGTHB(STR) : STR의 바이트 수
SELECT LENGTH('ABCD') FROM DUAL;    -- 글자수
SELECT LENGTHB('ABCD') FROM DUAL;   -- 저장될 바이트 수
SELECT LENGTH('오라클'), LENGTHB('오라클') FROM DUAL;
-- (5) LPAD(STR, 자릿수, 채울문자) : STR을 자릿수만큼 확보하고 왼쪽 빈자리에 채울문자로 출력
    -- LPAD(STR, 자릿수) : STR을 자릿수만큼 확보하고 왼쪽 빈자리에 ' '로 출력
    -- RPAD(STR, 자릿수, 채울문자) : STR을 자릿수만큼 확보하고 오른쪽 빈자리에 채울문자로 출력
    -- RPAD(STR, 자릿수) : STR을 자릿수만큼 확보하고 오른쪽 빈자리에 ' '로 출력
SELECT LPAD('ORACLE', 10, '#') FROM DUAL;
SELECT LPAD('ORACLE', 10) FROM DUAL;
DESC EMP;
    -- ENAME : 최장 10글자, SAL : 5자리.2자리
SELECT ENAME, SAL FROM EMP;     -- 문자는 왼쪽정렬, 숫자는 오른쪽정렬
SELECT LPAD(ENAME, 10, '-'), LPAD(SAL, 5, '$') FROM EMP;    -- 정렬 방향 전환
    -- EX. 사번, 이름(7369 S**** / 1111 W*** / 2222 M***** ...) - RPAD, SUBSTR, LENGTH 사용
    SELECT EMPNO, 
            RPAD(SUBSTR(ENAME, 1, 1), LENGTH(ENAME), '*') ENAME
        FROM EMP;
    -- EX. 사번, 이름, 직책(9자리확보), 입사일
    --     7369 Smith ____****k 80/12/**
    --     7566 Jones ___*****r 81/02/**
    SELECT EMPNO,
            INITCAP(ENAME) ENAME,
            LPAD(LPAD(SUBSTR(JOB, -1, 1), LENGTH(JOB), '*'), 9) JOB,
            SUBSTR(HIREDATE, 1, 6) || '*'
        FROM EMP;
    SELECT EMPNO,
            INITCAP(ENAME) ENAME,
            LPAD(LPAD(SUBSTR(JOB, -1, 1), LENGTH(JOB), '*'), 9) JOB,
            TO_CHAR(HIREDATE, 'RR/MM/') || '**'
        FROM EMP;
-- (6) INSTR(STR, 찾을문자) : STR에서 찾을 문자가 첫 번째로 나오는 위치(처음 1, 없으면 0)
-- INSTR(STR, 찾을문자, 시작위치) : STR의 시작위치부터 찾을 문자가 나오는 위치
SELECT INSTR('ABCABACABC', 'B'), INSTR('ABCABCABC', 'B', 3) FROM DUAL;
    -- EX. 9월에 입사한 사원의 모든 필드 (날짜 RR/MM/DD)
    SELECT * FROM EMP WHERE INSTR(HIREDATE, '09', 4) = 4;
    SELECT * FROM EMP WHERE SUBSTR(HIREDATE, 4, 2) = '09';
    SELECT * FROM EMP WHERE HIREDATE LIKE '__/09/__';
    -- EX. 9일에 입사한 사원의 모든 필드
    SELECT * FROM EMP WHERE INSTR(HIREDATE, '09', 7) = 7;
    SELECT * FROM EMP WHERE SUBSTR(HIREDATE, 7, 2) = '09';
    SELECT * FROM EMP WHERE HIREDATE LIKE '%09';
    -- EX. 9일이 아닌 날에 입사한 사원의 모든 필드
    SELECT * FROM EMP WHERE INSTR(HIREDATE, '09', 7) = 0;
    SELECT * FROM EMP WHERE SUBSTR(HIREDATE, 7, 2) != '09';
    SELECT * FROM EMP WHERE HIREDATE NOT LIKE '%09';
    
    
    
    
    
    
    
    
