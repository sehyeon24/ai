# flask --app app_getNpost run --host=127.0.0.1 --port=8090 --reload
from flask import Flask, request, render_template
from models import Member          # dto
from filters import mask_password  # 필터

app = Flask(__name__)
app.template_filter('mask_pw')(mask_password)

@app.route('/')
@app.route('/join', methods=['GET', 'POST'])  # 대소문자 구분X
def join():
    if request.method == 'GET':  # 대문자만
        return render_template('join_getNpost/join.html')
    elif request.method == 'POST':
        # name = request.args.get('name')  # GET방식일 때, 파라미터 값 받기
        name = request.form['name']  # POST방식일 때, 파라미터 값 받기
        id   = request.form['id']
        pw   = request.form['pw']
        addr = request.form['address']
        member = Member(name, id, pw, addr)
        return render_template('join_getNpost/result.html', member=member)

@app.route('/welcome', methods=['POST'])
def welcome():
    name = request.form['name']
    value = request.form['value']
    return render_template('welcome.html', name=name, value=value)

if __name__ == '__main__':
    app.run(debug=True)