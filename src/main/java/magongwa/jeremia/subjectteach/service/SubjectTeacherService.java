package magongwa.jeremia.subjectteach.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import magongwa.jeremia.subjectteach.model.SubjectTeacher;
import magongwa.jeremia.subjectteach.repository.SubjectTeacherRepository;

@Service
public class SubjectTeacherService {

	@Autowired
	private SubjectTeacherRepository subjectTeacherRepository;
	
	public List<SubjectTeacher> findAll() {
        return subjectTeacherRepository.findAll();
    }

    public Optional<SubjectTeacher> findById(String id) {
        return subjectTeacherRepository.findById(id);
    }

    public SubjectTeacher save(SubjectTeacher subjectTeacher) {
        return subjectTeacherRepository.save(subjectTeacher);
    }

    public void deleteById(String id) {
    	subjectTeacherRepository.deleteById(id);
    }
	
}
