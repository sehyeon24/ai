# # # Jinja2 템플릿 문법 # # #
# 1. 변수 {{ var }} 또는 {{ var : filter }}
#    기본 제공 필터 : lower, upper, title(단어 첫 글자만 대문자), length, trim capitalize(첫 글자만 대문자)
#    형변환 : {{ number|int }}
# 2. 제어 구조 {% .. %} : if문, for문
# 2-1. if :
#      {% if 조건 %} A태그 {% elif 조건 %} B태그 {% else %} C태그 {% endif %}
# 2-2. for :
#      {% for var in vars %} vars:나열 가능한 데이터구조
#        <태그>{{loop.index}} - {{ var }}</태그>
#          loop.index : 1부터, loop.index0 : 0부터
#          loop.first : 첫 번째면 True, loop.last : 마지막이면 True
#      {% endfor %}
# 3. 주석 {# jinja2 주석 #}  <!-- html 주석 --!>
# 4. header & footer include : {% include "header.html" %}

from flask import Flask, render_template, request
app = Flask(__name__, template_folder='templates', static_folder='static')
lst = []

@app.route('/', methods=['get', 'post'])
def index():
    if request.method == 'GET':
        name = None
    else:
        # name = request.args.get('name')    # get방식 파라미터값 받기
        name = request.form['name'].strip()  # post방식 파라미터값 받기. strip():좌우공백제거
    length = 0
    if name:
        lst.append(name)
        length = len(name)
    price = 12000
    return render_template('1_index.html', name=name, length=length, names=lst, price=price)

# 예외처리 페이지와 로깅
@app.errorhandler(404)
def page_not_found(error):
    app.logger.error('없는 페이지입니다.')  # 파이참 콘솔에 출력.
    return render_template('page_not_found.html'), 404  # 콘솔에 404출력. 튜플로 return.

if __name__ == '__main__':
    app.run(debug=True)