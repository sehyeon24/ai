from django.urls import path
from . import views

'''
/article/ => book_list
/article/new => book_new (article 추가)
/article/1/edit => book_edit (1번 article 수정)
/article/1/delete => book_delete (1번 article 삭제)
'''

app_name = 'article'
urlpatterns = [
    path('', views.book_list, name='list'),
    path('new/', views.book_new, name='new'),
    path('<int:pk>/edit/', views.book_edit, name='edit'),
    path('<int:pk>/delete/', views.book_delete, name='delete'),
]