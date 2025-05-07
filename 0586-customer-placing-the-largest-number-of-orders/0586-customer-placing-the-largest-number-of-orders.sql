# Write your MySQL query statement below

select customer_number from Orders Group by customer_number Order By Count(customer_number) desc limit 1;
