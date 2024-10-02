-- DAO에 쓸 QUERY

-- 1번 기능과 2번 기능에서 입력가능한 직업명들
SELECT JNAME FROM JOB;
SELECT * FROM PERSON;

-- 1번 기능 : PNAME을 입력받아 PNAME, JNAME, KOR, ENG, MAT를 입력받아 PERSON 테이블에 INSERT(SUBQUERY)
INSERT INTO PERSON (PNO, PNAME, JNO, KOR, ENG, MAT)
    VALUES (PERESON_PNO_SQ.NEXTVAL, PNAME, (SELECT JNO FROM JOB WHERE JNAME = '배우'),KOR, ENG, MAT);
    
-- 2번 기능 : JNAME을 입력받아 RANK, PNAME(PNO), JNAME, KOR, ENG, MAT, SUM 출력
--           (RANK는 SUM 내림차순으로 순위를 정합니다.)(hint. ROWNUM과 INLINE-VIEW 이용)
SELECT PNAME || '(' || PNO || '번)' PNAME, JNAME, KOR, ENG, MAT, KOR+ENG+MAT SUM
    FROM JOB J, PERSON P
    WHERE J.jNO = P.jNO
    ORDER BY SUM DESC;  -- INLINE-VIEW에 들어갈 QUERY
SELECT ROWNUM RANK, A.*
  FROM (SELECT PNAME || '(' || PNO || '번)' PNAME, JNAME, KOR, ENG, MAT, KOR+ENG+MAT SUM
            FROM PERSON P, JOB J 
            WHERE P.JNO = J.JNO AND JNAME = '배우'
            ORDER BY SUM DESC) A;
            
-- 3번 기능 : 입력받지 않고 RANK, PNAME(PNO), JNAME, KOR, ENG, MAT, SUM 출력
SELECT ROWNUM RANK, A.*
  FROM (SELECT PNAME || '(' || PNO || '번)' PNAME, JNAME, KOR, ENG, MAT, KOR+ENG+MAT SUM
            FROM PERSON P, JOB J 
            WHERE P.JNO = J.JNO 
            ORDER BY SUM DESC) A;

----------------------------------------------------------------------------------------------------------------------------------

-- DAO에 쓸 QUERY

-- 1번기능과 2번 기능에서 입력가능한 직업명들(jnameList)
SELECT JNAME FROM JOB;

-- 1번(insertPerson) : PNAME, JNAME, KOR, ENG, MAT를 입력받아 PERSON 테이블 INSERT
INSERT INTO PERSON (PNO, PNAME, JNO, KOR, ENG, MAT)
  VALUES (PERSON_PNO_SQ.NEXTVAL, '홍길동',
    (SELECT JNO FROM JOB WHERE JNAME='배우'), 90, 95, 99);
    
-- 2번(getPerson) : JNAME을 입력받아 RANK, PNAME(PNO), JNAME, KOR, ENG, MAT, SUM 출력 (SELECT)
              -- RANK는 SUM 내림차순으로 순위를 정합니다(hint. rownum과 inline이용)
SELECT PNAME||'('||PNO||'번)' PNAME, JNAME, KOR, ENG, MAT, KOR+ENG+MAT SUM
  FROM PERSON P, JOB J 
  WHERE P.JNO=J.JNO
  ORDER BY SUM DESC; -- INLINE VIEW에 들어갈 QUERY 
SELECT ROWNUM RANK, A.*
  FROM (SELECT PNAME||'('||PNO||'번)' PNAME, JNAME, KOR, ENG, MAT, KOR+ENG+MAT SUM
        FROM PERSON P, JOB J 
        WHERE P.JNO=J.JNO AND JNAME='배우'
        ORDER BY SUM DESC) A;
        
-- 3번(getPerson) : RANK, PNAME(PNO), JNAME, KOR, ENG, MAT, SUM 출력
SELECT ROWNUM RANK, A.*
  FROM (SELECT PNAME||'('||PNO||'번)' PNAME, JNAME, KOR, ENG, MAT, KOR+ENG+MAT SUM
        FROM PERSON P, JOB J 
        WHERE P.JNO=J.JNO 
        ORDER BY SUM DESC) A;
        