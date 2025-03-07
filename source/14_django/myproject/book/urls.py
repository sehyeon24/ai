from django.urls import path
from . import views

'''
/book/ => book_list
/book/new => book_new (book 추가)
/book/1/edit => book_edit (1번 book 수정)
/book/1/delete => book_delete (1번 book 삭제)
'''

app_name = 'book'
urlpatterns = [
    path('', views.book_list, name='list'),
    path('new/', views.book_new, name='new'),
    path('<int:pk>/edit/', views.book_edit, name='edit'),
    path('<int:pk>/delete/', views.book_delete, name='delete'),
]