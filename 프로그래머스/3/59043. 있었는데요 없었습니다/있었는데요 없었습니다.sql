-- 코드를 입력하세요
select ai.ANIMAL_ID, ai.NAME
from ANIMAL_INS as AI
join ANIMAL_OUTS as AO
on AI.ANIMAL_ID = AO.ANIMAL_ID
where ai.DATETIME>ao.DATETIME
order by ai.DATETIME asc
