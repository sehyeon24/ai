# FastAPI에서 post 방식으로 요청 파라미터 전송 시 타입 검증 라이브러리 ★
from pydantic import BaseModel

class ToDoRequest(BaseModel):
    contents : str | None=''
    is_done  : bool | None=False