# pip install jinja2

from fastapi import FastAPI
from fastapi.templating import Jinja2Templates  # templates 지정
from fastapi.staticfiles import StaticFiles     # static 폴더 지정
from fastapi import Request                     # html로 rendering
from fastapi import Form                        # post 방식으로 들어온 form 데이터 받기
from pydantic import BaseModel                  # form 데이터 자동 검증


app = FastAPI()
templates = Jinja2Templates(directory='templates')
app.mount('/static', StaticFiles(directory='static'), name='static')

@app.get('/')
@app.get('/html1')
async def html1(request:Request):  # rendering
    return templates.TemplateResponse('ex3-1.html', {'request':request})