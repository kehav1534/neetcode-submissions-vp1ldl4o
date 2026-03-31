SELECT seller_name FROM seller where seller_id NOT IN (
    Select distinct seller_id from orders where EXTRACT(YEAR from sale_date)= 2020
)
order by seller_name;