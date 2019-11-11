package magongwa.jeremia.subjectteach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import magongwa.jeremia.subjectteach.model.SubjectTeacher;
import magongwa.jeremia.subjectteach.service.SubjectTeacherService;


@RestController
public class SubjectTeacherController {
	
	
	@Autowired
	private SubjectTeacherService subjectTeacherService;
	
	
	@RequestMapping("/create")
	public String create( @RequestParam String subjectId, @RequestParam String teacherId, @RequestParam String groupId)
	{
		System.out.print("Creating");
		SubjectTeacher subjectTeacher  = subjectTeacherService.create(subjectId,teacherId,groupId);
		return subjectTeacher.toString();
	}
	@RequestMapping("/getAll")
	public List<SubjectTeacher> SubjectTeacherAll()
	{
        //Added the get all features in the controller
		return subjectTeacherService.getAll();
	}
	
	@RequestMapping("/getTeacherId")
	public SubjectTeacher getTeacher(@RequestParam String teacherId)
	{
	   
		return subjectTeacherService.getByTeacherId(teacherId);
	}
	@RequestMapping("/getSubjectId")
	public SubjectTeacher getSubject(@RequestParam String subjectId)
	{
	   
		return subjectTeacherService.getBySubjectId(subjectId);
	}
	@RequestMapping("/getGroupId")
	public SubjectTeacher getGroup(@RequestParam String groupId)
	{
	   
		return subjectTeacherService.getByGroupId(groupId);
	}
	@RequestMapping("/updateSubjectTeacher")
	public String update(@RequestParam String subjectId, @RequestParam String teacherId, @RequestParam String groupId)
	{
		SubjectTeacher subjectTeacher  = subjectTeacherService.update(subjectId, teacherId, groupId);
	    return subjectTeacher.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String teacherId)
	{
		subjectTeacherService.delete(teacherId);
		return "Deleted "+teacherId;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		subjectTeacherService.deleteAll();
		return "Deleted all the Records";
	} 

}
