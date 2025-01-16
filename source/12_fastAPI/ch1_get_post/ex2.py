# RestAPI 파라미터 전달 방식
#   /items/item_id?pw=123, /items?skip=1&limit=5

from fastapi import FastAPI

app = FastAPI()

item_db = [{'name':'홍길동', 'age':30},
           {'name':'신길동', 'age':20},
           {'name':'김길동', 'age':10}]

@app.get('/items/{item_id}')
async def read_item(item_id : str,  # type hint
                    pw : str | None=None):  # 파라미터 값이 들어오지 않을 경우도 있음
    if pw:  # /items/abc?pw=111
        return {'item_id':item_id, 'pw':pw}
    else:   # /items/abc
        return {'item_id':item_id}

@app.get('/items')  # /items?skip=1&limit=5, /items?skip=1
async def read_items(skip : int, limit : int=10):
    return item_db[skip:skip+limit]

@app.get('/item/{name}/{age}')  # /item/hong/33
async def item(name : str, age : int):
    return {'이름':name, '나이':age}