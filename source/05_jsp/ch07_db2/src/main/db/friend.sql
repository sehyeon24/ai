-- 친구 데이터 저장할 table 생성
DROP TABLE FRIEND;
DROP SEQUENCE FRIEND_NO_SQ;

CREATE TABLE FRIEND (
    NO   NUMBER(4) PRIMARY KEY,
    NAME VARCHAR2(50) NOT NULL,
    TEL  VARCHAR2(30) UNIQUE
);

-- 시퀀스 생성
CREATE SEQUENCE FRIEND_NO_SQ MAXVALUE 9999 NOCACHE NOCYCLE;

-- 더미 데이터 insert
INSERT INTO FRIEND (NO, NAME, TEL) VALUES (FRIEND_NO_SQ.NEXTVAL, '홍길동', '010-9999-9999');
INSERT INTO FRIEND (NO, NAME, TEL) VALUES (FRIEND_NO_SQ.NEXTVAL, '홍길동', '');
INSERT INTO FRIEND (NO, NAME, TEL) VALUES (FRIEND_NO_SQ.NEXTVAL, '홍길동', NULL);
INSERT INTO FRIEND (NO, NAME, TEL) VALUES (FRIEND_NO_SQ.NEXTVAL, '김길동', '010-8888-8888');

-- DAO에 들어갈 query
SELECT * FROM FRIEND;
INSERT INTO FRIEND (NO, NAME, TEL) VALUES (FRIEND_NO_SQ.NEXTVAL, '박길동', '010-7777-7777');