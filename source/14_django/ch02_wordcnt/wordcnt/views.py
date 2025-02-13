from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.

def wordinput(request):
    return render(request, 'wordcnt/wordinput.html')

def about(request):
    return render(request, 'wordcnt/about.html')

def result(request):
    # post 방식으로 전달된 fulltxt 파라미터를 받아 글자수, 단어수, 단어당 출현빈도 계산
    # print(request.POST['fulltxt'], request.POST.get('fulltxt'))
    # fulltxt = request.POST['fulltxt']  # 홍 홍 화이팅
    # fulltxt = request.GET.get('fulltxt')
    fulltxt = request.GET['fulltxt']
    strlength = len(fulltxt) # 글자수
    words = fulltxt.split()  # space 단위로 단어 분리 ['홍', '홍', '화이팅']
    wordcnt = len(words)     # 단어갯수
    words_dic = dict()       # 빈 딕셔너리
    for word in words:
        if word in words_dic.keys():
            words_dic[word] += 1  # 이미 출현했던 단어로 빈도수 증가
        else:
            words_dic[word] = 1   # 처음 출현하는 단어 1
    context = {
        'fulltxt'  : fulltxt,
        'strlength': strlength,
        'wordcnt'  : wordcnt,
        'dict'     : words_dic.items()
    }
    return render(request, 'wordcnt/result.html', context)