from django import forms
from django.core.validators import MinLengthValidator
from django.core.validators import MinValueValidator
from django.core.validators import MaxValueValidator
from .models import Book

class BookForm(forms.Form):
    title     = forms.CharField(label='책제목')
    author    = forms.CharField(label='글쓴이', validators=[MinLengthValidator(3)])
    publisher = forms.CharField(label='출판사', required=False)
    sales     = forms.IntegerField(initial=1000, validators=[MinValueValidator(0), MaxValueValidator(1000000)])
    def save(self, commit=False):
        # article = Book(title = self.cleaned_data['title'],
        #             author = self.cleaned_data['author'],
        #             publisher = self.cleaned_data['publisher'],
        #             sales = self.cleaned_data['sales'])
        book = Book(**self.cleaned_data)
        if commit:
            book.save()
        return book

class BookModelForm(forms.ModelForm):  # ModelForm 내 save() 포함
    class Meta:
        model = Book
        fields = ['title', 'author', 'publisher', 'sales']
        # fields = '__all__'
    def clean_author(self):
        author = self.cleaned_data['author']
        if author:
            if len(author) < 3:
                raise forms.ValidationError('저자 입력 시 3글자 이상')
        return author
    # def check_exist(self, title, author):
    #     return Book.objects.filter(title=title, author=author).exists()
    # def clean(self):
    #     cleaned_data = super().clean()  # self.cleaned_data['title']
    #     if self.check_exist(cleaned_data.get('title'), cleaned_data.get('author')):
    #         return forms.ValidationError('이미 등록된 책입니다.')