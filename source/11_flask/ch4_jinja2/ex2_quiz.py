from flask import Flask, render_template, request
app = Flask(__name__,
            # templates, static 폴더명 변경 가능하나 변경하는 경우는 극히 드물다
            template_folder = "templates",
            static_folder = "static")

@app.route('/', methods=['get','post'])
def gugudan():
    if request.method == 'GET':
        num = request.args.get('no')
    else:
        num = request.form['num']
    return render_template("2_quiz.html", num=num)

if __name__ == "__main__":
    app.run(debug=True)