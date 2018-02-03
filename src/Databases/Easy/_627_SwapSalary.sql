// https://leetcode.com/problems/swap-salary/description/
UPDATE salary
SET SEX = CASE
WHEN sex='m' THEN
    'f'
ELSE
    'm'
END;