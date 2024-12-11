from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

# 원하는 페이지만큼 검색하여 검색 결과를 데이터프레임으로 출력
driver = webdriver.Chrome()
time.sleep(1)

url = 'https://www.daum.net/'
driver.get(url)
# driver.implicitly_wait(0.5)  # 요소를 찾을 때까지 0.5초 대기 시간을 가짐
time.sleep(0.5)  # 0.5초 대기

# 검색버튼 클릭(커서 대기)
driver.find_element(By.CLASS_NAME, 'tf_keyword').click()

# 검색할 단어 받기
# query = input('검색할 단어는 ? ')
# 받은 단어 검색란에 전송
driver.find_element(By.CSS_SELECTOR, 'input[type="text"]').send_keys('비트코인')

# 검색 버튼 클릭
driver.find_element(By.CLASS_NAME, 'btn_ksearch').click()

time.sleep(1)

# 뉴스 탭 클릭
driver.find_elements(By.CSS_SELECTOR, 'ul.list_tab > li')[1].click()

# 기사 제목 가져오기
news_list = []

# ========== 여기서부터는 페이지를 새로 가져올 때 다시 실행되어야 함 ========== #
page_numbers = 3
for page_number in range(1, page_numbers+1):
    
    bodies = driver.find_elements(By.CSS_SELECTOR, 'div.item-title > strong.tit-g.clamp-g')
    # print(len(bodies))  # 뉴스 기사 10개

    for body in bodies:
        a = body.find_element(By.TAG_NAME, 'a')
        title = a.text
        link = a.get_attribute('href')
        news_list.append([title, link])
        # print(title, link)

    # 2페이지로 이동
    page_nav = driver.find_element(By.CSS_SELECTOR, 'div.inner_paging')
    next_page = page_nav.find_element(By.LINK_TEXT, str(page_number+1))
    next_page.click()
    time.sleep(1.5)
driver.close()
import pandas as pd
pd.DataFrame(news_list, columns=['title', 'link']).to_csv('지울.csv', encoding='cp949')