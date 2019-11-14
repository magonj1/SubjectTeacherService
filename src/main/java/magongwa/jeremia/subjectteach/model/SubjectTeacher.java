package magongwa.jeremia.subjectteach.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SubjectTeacher")
public class SubjectTeacher {

	@Id
	private String subjectTeacherId;
	
	private String subjectId;
	private String teacherId;
	private String groupId;
	
	
	public SubjectTeacher(String subjectId, String teacherId, String groupId) {
		super();
		this.subjectId = subjectId;
		this.teacherId = teacherId;
		this.groupId = groupId;
	}
	
	public String getSubjectTeacherId() {
		return subjectTeacherId;
	}

	public void setSubjectTeacherId(String subjectTeacherId) {
		this.subjectTeacherId = subjectTeacherId;
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
		return "SubjectTeacher [subject_teacher_id=" + subjectTeacherId + ", subjectId=" + subjectId + ", teacherIid="
				+ teacherId + ", groupId=" + groupId + "]";
	}
	
	
	
	
	

}
