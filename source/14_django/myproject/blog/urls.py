from django.urls import path, register_converter
from . import views
from .converters import CodeConverter

register_converter(CodeConverter, 'dddd')
app_name = 'blog'
urlpatterns = [
    path('', views.index, name='index'),
    # localhost:8000/blog/1 (한 자리)
    # path('<int:post_id>/', views.detail, name='detail'), # int 컨버터 사용
    # localhost:8000/blog/2000 (1~4자리)
    path('<dddd:post_id>/', views.detail, name='detail'),  # CodeConverter 컨버터 사용
    path('json/',  views.json_test, name='json'),
    path('excel/', views.excel_download, name='excel'),
    path('csv/',   views.pandas_csv_download, name='csv'),
    path('csvexcel/', views.pandas_excel_download, name='csvexcel'),
]