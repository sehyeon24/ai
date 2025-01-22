from connection import conn

def get_todos():
    cursor = conn.cursor()
    sql = 'SELECT * FROM TODO ORDER BY ID'
    cursor.execute(sql)
    results = cursor.fetchall()  # SQL문 결과 : 튜플 list
    cursor.close()
    todos = []
    for result in results:  # result:튜플
        # print(result)
        todos.append({'id':result[0],
                      'contents':result[1],
                      'is_done':result[2]})
    return todos  # 딕셔너리 list

if __name__ == '__main__':
    print(get_todos())