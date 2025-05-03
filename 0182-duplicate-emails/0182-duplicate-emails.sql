# Write your MySQL query statement below
select email as Email from Person Group By email Having Count(email) > 1;