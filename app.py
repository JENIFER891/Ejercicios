# app.py
from flask import Flask

app = Flask(__name__)

@app.route('/')
def hola():
    return '¡Hola Mundo desde Flask!'

if __name__ == '__main__':
    app.run(debug=True)
