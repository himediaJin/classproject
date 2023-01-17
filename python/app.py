#flask
from flask import Flask
from flask_cors import CORS

app = Flask(__name__)

#Cross origins 이슈 해결
CORS(app)

@app.route('/')
def sw_g():
    return '<h1>Flask에서 응답</h1>'

print(__name__)
if __name__ == '__main__':
    app.run(host='127.0.0.1', port=5000, debug=False)