from django.test import TestCase

# Create your tests here.

words = ['홍', '홍', '화이팅', 'other', '홍']
words_dic = dict()  # 빈 딕셔너리
print(words_dic.keys())
for word in words:
    if word in words_dic.keys(): # words_dic['홍']
        words_dic[word] +=1  # {'홍':2}=>{'홍':3}
    else:
        words_dic[word] = 1  # {'홍':1}=>{'화이팅':1, 'other':1}
# print(words_dic)  # {'홍': 3, '화이팅': 1, 'other': 1}
# print(words_dic.items())  # [('홍', 3), ('화이팅', 1), ('other', 1)]
for word, cnt in words_dic.items():
    print(word, ':', cnt)