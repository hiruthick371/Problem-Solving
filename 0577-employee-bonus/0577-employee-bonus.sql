# Write your MySQL query statement below

select e.name as name, b.bonus as bonus from Employee e Left Outer Join Bonus b ON
e.empId = b.empId where b.bonus < 1000 Or b.bonus is Null;
