# Write your MySQL query statement below
Select c.name as Customers from Customers c Left Outer Join Orders o On c.id = o.customerId
Where o.id Is Null;
  
