package magongwa.jeremia.subjectteach.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SubjectTeacher")
public class SubjectTeacher {

	@Id
	private ObjectId subject_teacher_id;
	private String subjectId;
	private String teacherId;
	private String groupId;
	
	
	public SubjectTeacher(String subjectId, String teacherId, String groupId) {
		super();
		this.subjectId = subjectId;
		this.teacherId = teacherId;
		this.groupId = groupId;
	}
	public ObjectId getSubject_teacher_id() {
		return subject_teacher_id;
	}
	public void setSubject_teacher_id(ObjectId subject_teacher_id) {
		this.subject_teacher_id = subject_teacher_id;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherIid(String teacherIid) {
		this.teacherId = teacherIid;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	@Override
	public String toString() {
		return "SubjectTeacher [subject_teacher_id=" + subject_teacher_id + ", subjectId=" + subjectId + ", teacherIid="
				+ teacherId + ", groupId=" + groupId + "]";
	}
	
	
	
	
	

}
