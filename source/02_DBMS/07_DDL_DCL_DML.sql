-- [VII] DDL, DCL, DML
-- SQL = DDL(테이블 생성, 테이블 삭제, 테이블 구조 변경, 테이블 모든 데이터 제거) + : ROLLBACK(삭제) 불가능
--       DML(SELECTM INSERT, UPDATE, DELETE) + : ROLLBACK 가능
--       DCL(사용자 계정 생성, 사용자에게 권한 부여, 권한 박탈, 사용자 계정 삭제, 트랜잭션 명령어)
-- ★★★ DDL ★★★ --
-- 1. 테이블 생성(CREATE TABLE 테이블명 ....) : 테이블 구조를 정의
DROP TABLE BOOK;    -- 테이블 삭제
CREATE TABLE BOOK(
    BOOKID      NUMBER(4),      -- BOOKID필드의 타입은 숫자 4자리를 저장
    BOOKNAME    VARCHAR2(20),   -- BOOKNAME필드의 타입은 문자 20byte를 저장
    PUBLISHER   VARCHAR2(30),   -- PUBLISHER필드의 타입은 문자 30byte를 저장
    RDATE       DATE,           -- RDATE필드의 타입은 DATE(날짜, 시간 포함)로 저장
    PRICE       NUMBER(8, 2),   -- PRICE필드의 타입은 숫자 전체 8자리 중 소수점 2자리까지를 저장
    PRIMARY KEY(BOOKID)         -- 제약조건 : BOOKID필드가 주키(PRIMARY KEY:NOT NULL, UNIQUE)
);
SELECT * FROM BOOK;
DESC BOOK;  -- BOOK테이블의 구조

DROP TABLE BOOK;    -- 테이블 삭제
CREATE TABLE BOOK(
    BOOKID      NUMBER(4) PRIMARY KEY,
    BOOKNAME    VARCHAR2(20), 
    PUBLISHER   VARCHAR2(30), 
    RDATE       DATE,        
    PRICE       NUMBER(8, 2)  
);
SELECT * FROM BOOK;  

    -- DEPT01테이블 : DEPTNO(숫자2:PK), DNAME(문자14), LOC(문자13)
CREATE TABLE DEPT01 (
    DEPTNO  NUMBER(2),
    DNAME   VARCHAR2(14),
    LOC     VARCHAR2(13),
    PRIMARY KEY (DEPTNO)
);
SELECT * FROM DEPT01;
    -- EX. EMP와 유사한 EMP01테이블 : EMPNO(숫자4-PK), ENAME(문자10), SAL(숫자7,2), 
                                 -- DEPTNO(숫자2, DEPT01테이블의 DEPTNO와 연동:외래키FK)
CREATE TABLE EMP01 (
    EMPNO   NUMBER(4) PRIMARY KEY,
    ENAME   VARCHAR2(10),
    SAL     NUMBER(7, 2),
    DEPTNO  NUMBER(2) REFERENCES DEPT01(DEPTNO) -- FK // DEPTNO필드를 DEPT01테이블과 연동
);                            
SELECT * FROM EMP01;
-- 외래키로 연결할 경우 : 참조테이블(DEPT01)의 데이터를 먼저 INSERT해야 함
INSERT INTO DEPT01 VALUES (10, '신림', 'IT');
INSERT INTO EMP01 VALUES (1000, '홍', 9000, 10);
DROP TABLE DEPT01;  -- 참조하는 테이블이 있을 경우 테이블 삭제 불가 // EMP01을 먼저 지워야 함
COMMIT;     -- DML 명령어들을 데이터베이스에 적용(트랜잭션)

-- 서브쿼리를 이용한 테이블 생성
CREATE TABLE EMP02
    AS 
    SELECT * FROM EMP;  -- 서브쿼리 결과로 EMP02테이블 생성 후, EMP02테이블에 데이터 들어감(제약조건 미포함)
SELECT * FROM EMP02;
DESC EMP;
DESC EMP02;     -- NOT NULL 없는 이유 : PK 미포함 되었기 때문에

CREATE TABLE EMP03
    AS
    SELECT EMPNO, ENAME, DEPTNO FROM EMP;
SELECT * FROM EMP03;

