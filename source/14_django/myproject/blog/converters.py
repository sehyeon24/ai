# https://github.com/django/django/blob/3.2/django/urls/converters.py

class CodeConverter:
    regex = '\d{1,4}'  # 숫자 1~4자리까지

    def to_python(self, value):
        return int(value)

    def to_url(self, value):
        return str(value)