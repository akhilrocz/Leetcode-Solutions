# Write your MySQL query statement below


select 'Low Salary' as category, count(case when income<20000 then account_id end) as accounts_count 
from Accounts 
union all 
select 'Average Salary' as category, count(case when income between 20000 and 50000 then account_id end) as accounts_count from Accounts 
union all 
select "High Salary" as category, count(case when income>50000 then account_id end) as accounts_count from Accounts;