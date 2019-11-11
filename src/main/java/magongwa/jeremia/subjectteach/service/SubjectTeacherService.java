package magongwa.jeremia.subjectteach.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import magongwa.jeremia.subjectteach.model.SubjectTeacher;
import magongwa.jeremia.subjectteach.repository.SubjectTeacherRepository;

@Service
public class SubjectTeacherService {

	@Autowired
	private SubjectTeacherRepository subjectTeacherRepository;
	
	public SubjectTeacher create(String subject_id, String teacher_id, String group_id)
	{
		return subjectTeacherRepository.save(new SubjectTeacher(subject_id,teacher_id,group_id));
	}
	public List<SubjectTeacher> getAll()
	{
		return subjectTeacherRepository.findAll();
	}
	
	public SubjectTeacher getBySubjectId(String subjectId)
	{
		return subjectTeacherRepository.findBySubjectId(subjectId);
	}
	public SubjectTeacher getByGroupId(String groupId)
	{
		return subjectTeacherRepository.findByGroupId(groupId);
	}
	public SubjectTeacher getByTeacherId(String teacherId)
	{
		return subjectTeacherRepository.findByTeacherId(teacherId);
	}
	
	public SubjectTeacher update(String subject_id, String teacher_id, String group_id)
	{
		SubjectTeacher subjectTeacher = subjectTeacherRepository.findByTeacherId(teacher_id);
		subjectTeacher.setGroupId(group_id);
		
		return subjectTeacherRepository.save(subjectTeacher);
	}
	public void deleteAll()
	{
		subjectTeacherRepository.deleteAll();
	}
	public void delete(String teacher_id)
	{
		SubjectTeacher subject = subjectTeacherRepository.findByTeacherId(teacher_id);
		subjectTeacherRepository.delete(subject);
	}
	
}
