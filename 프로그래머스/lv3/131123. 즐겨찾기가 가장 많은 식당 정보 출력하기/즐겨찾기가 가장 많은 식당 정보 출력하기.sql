-- 코드를 입력하세요

# 음식 종류별 즐겨찾기수가 가장 많은 식당의
# 음식종류, ID, 식당이름, 즐겨찾기수


select A.FOOD_TYPE, A.REST_ID, A.REST_NAME, A.FAVORITES
from REST_INFO A
join (select FOOD_TYPE, max(FAVORITES) as FAV from REST_INFO group by FOOD_TYPE) B
on A.FOOD_TYPE = B.FOOD_TYPE AND A.FAVORITES = B.FAV
ORDER BY A.FOOD_TYPE DESC;


# SELECT A.FOOD_TYPE,REST_ID,REST_NAME,FAVORITES
# FROM REST_INFO A

# JOIN (SELECT FOOD_TYPE,MAX(FAVORITES) AS FAV
#     FROM REST_INFO
#     GROUP BY FOOD_TYPE)B ON A.FOOD_TYPE=B.FOOD_TYPE AND A.FAVORITES=B.FAV
# ORDER BY A.FOOD_TYPE DESC