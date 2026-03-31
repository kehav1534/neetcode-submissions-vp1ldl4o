-- Write your query below
SELECT u.name, COALESCE(SUM(r.distance), 0) as travelled_distance from rides as r 
RIGHT JOIN users as u
ON u.id=r.user_id
group BY r.user_id, u.id
order by travelled_distance DESC, u.name
;