# pip install jinja2

from fastapi import FastAPI
from fastapi.templating import Jinja2Templates  # templates 지정
from fastapi.staticfiles import StaticFiles     # static 폴더 지정
from fastapi import Request                     # html로 rendering
from fastapi import Form                        # post 방식으로 들어온 form 데이터 받기
from pydantic import BaseModel                  # form 데이터 자동 검증

class User(BaseModel):
    name : str
    id : str
    pw : int

app = FastAPI()
templates = Jinja2Templates(directory='templates')
app.mount('/static', StaticFiles(directory='static'), name='static')

@app.get('/')
@app.get('/html1')
async def html1(request:Request):  # rendering
    return templates.TemplateResponse('ex3-1.html', {'request':request})

@app.get('/html2')
async def html2(request:Request):
    return templates.TemplateResponse('ex3-2.html', {'request':request, 'name':'홍길동'})

# @app.get('/html3')
# async def html3(name:str, id:str, pw:int):
#     return {'name':name, 'id':id, 'pw':pw}

# post방식 전달시 반드시 해야 할 install
# pip install python-multipart
@app.post('/html3')
async def html3(user:User = Form()):
    # return user.dict()
    return {'name':user.name, 'id':user.id, 'pw':user.pw}
# async def html3(name:str=Form(), id:str=Form(), pw:int=Form()):
#     return {'name':name, 'id':id, 'pw':pw}