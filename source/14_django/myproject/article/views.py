from django.shortcuts import render
from django.views.generic import ListView, CreateView, DetailView, UpdateView, DeleteView

from article.models import Article

# Create your views here.

article_list = ListView.as_view(model=Article)