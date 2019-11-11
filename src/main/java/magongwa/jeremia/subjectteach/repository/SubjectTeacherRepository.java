package magongwa.jeremia.subjectteach.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import magongwa.jeremia.subjectteach.model.SubjectTeacher;


@Repository
public interface SubjectTeacherRepository extends MongoRepository< SubjectTeacher, String> {

	public  SubjectTeacher findBySubjectId(String subjectId);
	public  SubjectTeacher findByTeacherId(String teacherId);
	public  SubjectTeacher findByGroupId(String groupId);
 
	
}
