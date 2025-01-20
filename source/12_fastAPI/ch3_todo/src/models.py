from pydantic import BaseModel  # 자동 타입 체크

class ToDoRequest(BaseModel):
    id : int
    contents : str
    is_done : bool | None=False