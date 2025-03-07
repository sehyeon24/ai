DROP TABLE TODO;
DROP SEQUENCE TODO_SQ;

CREATE TABLE TODO(
    ID NUMBER (4) PRIMARY KEY,
    CONTENTS VARCHAR2(256) NOT NULL,
    IS_DONE NUMBER(1) DEFAULT 0
);
CREATE SEQUENCE TODO_SQ NOCACHE NOCYCLE MAXVALUE 9999;

CREATE OR REPLACE TRIGGER TODO_TRIGGER
BEFORE INSERT ON TODO
FOR EACH ROW
BEGIN
    SELECT TODO_SQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/

INSERT INTO TODO (CONTENTS, IS_DONE) VALUES ('할일', 0);
-- INSERT INTO TODO (ID, CONTENTS, IS_DONE) VALUES (10, '할일', 0);

SELECT * FROM TODO;

COMMIT;