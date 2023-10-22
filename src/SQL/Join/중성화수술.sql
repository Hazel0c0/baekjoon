ANIMAL_INS 테이블 : 동물 보호소에 들어온 동물
ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE
동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부

ANIMAL_OUTS 테이블 : 동물 보호소에서 입양 보낸 동물
ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME
각각 동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부

-> 보호 시작일 보다 입양일이 더 빠른 동물 (보호>입양일)
조건 - 아이디, 이름 조회 / 보호일 빠른 순(오름차순 asc)

select ai.ANIMAL_ID, ai.NAME
from ANIMAL_INS as AI
join ANIMAL_OUTS as AO
on AI.ANIMAL_ID = AO.ANIMAL_ID
where ai.DATETIME>ao.DATETIME
order by ai.DATETIME asc





