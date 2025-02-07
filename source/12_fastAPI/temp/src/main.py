from fastapi import FastAPI, Request
from fastapi.staticfiles import StaticFiles
from fastapi.templating import Jinja2Templates
from starlette.responses import RedirectResponse

from models import ToDoRequest
from fastapi import Form #create시 필요
from database.repository import get_todos, get_todo, create_todo, update_todo, delete_todo
import os

app=FastAPI()
BASE_DIR = os.path.dirname(os.path.abspath(__file__))
app.mount('/static',
          StaticFiles(directory=os.path.join(BASE_DIR, '../static')),
          name='static')
templates = Jinja2Templates(directory=os.path.join(BASE_DIR, '../templates'))

# @:데코레이션 ★ / Create(post), Read(get), Update(put,patch), Delete(delete)
@app.get('/')
@app.get('/todos')
async def get_todos_handler(request:Request):  # async def:비동기함수 ★
    # 매개변수 안 request : html 연동 시
    # 비동기를 기본으로 지원하는 파이썬 웹 프레임워크 : (FastAPI) ★
    # MVT 기반의 강력한 파이썬 웹 프레임워크 : 장고(django) ★
    todos = get_todos()
    return templates.TemplateResponse('todos.html', {'request':request, 'todos':todos})

@app.get('/todos/{todo_id:int}')  # 경로 매개변수 정수 타입 지정 ★
async def get_todo_handler(request:Request, todo_id:int):
    todo = get_todo(todo_id)
    return templates.TemplateResponse('todo.html', {'request':request, 'todo':todo})

# 터미널 실행 : uvicorn main:app --reload ★
# 없는 페이지 response state code : 404 Not Found Error ★