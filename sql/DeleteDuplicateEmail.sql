DELETE FROM Person 
WHERE id NOT IN (
  SELECT mid
FROM (SELECT MIN(id) mid
  FROM Person
  GROUP BY email) tmp
);
