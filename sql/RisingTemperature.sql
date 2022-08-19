SELECT id
FROM (
SELECT *,
    lag(temperature, 1) over (order by recordDate) as lagtmp,
    lag(recordDate, 1) over (order by recordDate) as lagdate
  FROM Weather
) as t
WHERE DATEDIFF(lagdate, recordDate) = 1 AND temperature > lagtmp
