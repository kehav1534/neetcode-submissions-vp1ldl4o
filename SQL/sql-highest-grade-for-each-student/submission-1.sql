select student_id, exam_id, score from 
(Select student_id, exam_id, score, row_number() over(partition by student_id order by score desc, exam_id asc) max_score
from exam_results)
where max_score=1;