-- [XI] 인덱스 : 조회를 빠르게 하는 인덱스
DROP TABLE EMP01;
CREATE TABLE EMP01 AS SELECT * FROM EMP;    -- EMP테이블과 내용이 같은 EMP01생성
SELECT * FROM EMP01;    -- 14행
INSERT INTO EMP01 SELECT * FROM EMP01;  -- 데이터 뻥튀기 1번 실행(28행), 2번 실행(56행)
SELECT TO_CHAR(COUNT(*), '9,999,999') FROM EMP01;   -- 56개 확인
INSERT INTO EMP01 SELECT * FROM EMP01;  -- 11번 실행(약 11만개)
SELECT TO_CHAR(COUNT(*), '9,999,999') FROM EMP01;   -- 11만개
INSERT INTO EMP01 (EMPNO, ENAME, DEPTNO) VALUES (1111, '홍길동', 40);
INSERT INTO EMP01 SELECT * FROM EMP01;  -- 1번 실행(약 22만개), 2번 실행(약 44만개), 3번 실행(약 90만개) 중 홍길동 약 8개
SELECT TO_CHAR(COUNT(*), '9,999,999') FROM EMP01;   -- 91만개
SELECT * FROM EMP01 WHERE ENAME = '홍길동';    -- 인덱스 없이 조회 0.016초
-- 인덱스 생성
CREATE INDEX IDX_EMP01_ENAME ON EMP01(ENAME);   -- 0.675초
SELECT * FROM EMP01 WHERE ENAME = '홍길동';    -- 인덱스 생성 후 조회 0.001초
COMMIT;
INSERT INTO EMP01 SELECT * FROM EMP01;          -- 인덱스 생성 후 약 91만개 INSERT -> 약 182만개 // 57.897초
SELECT TO_CHAR(COUNT(*), '9,999,999') FROM EMP01;   -- 약 183만개
ROLLBACK;   -- 24.191초
DROP INDEX IDX_EMP01_ENAME; -- 인덱스 삭제
SELECT TO_CHAR(COUNT(*), '9,999,999') FROM EMP01;   -- 약 91만개
INSERT INTO EMP01 SELECT * FROM EMP01;           -- 인덱스 삭제 후 약 91만개 -> 약 182만개 // 4.463초
ROLLBACK;   -- 0.182초
DROP TABLE EMP01;   -- 테이블을 지우면 해당 테이블의 인덱스는 자동 삭제
