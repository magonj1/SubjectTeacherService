package magongwa.jeremia.subjectteach.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import magongwa.jeremia.subjectteach.model.SubjectTeacher;
import magongwa.jeremia.subjectteach.service.SubjectTeacherService;


@CrossOrigin(origins = {"http://localhost:4200"},maxAge = 4800, allowedHeaders = "*",allowCredentials = "false")
@RestController
@RequestMapping(path = "Api/SubjectTeacher")
public class SubjectTeacherController {
	
	
	@Autowired
	private SubjectTeacherService subjectTeacherService;
	
	
	@GetMapping
    public ResponseEntity<List<SubjectTeacher>> findAll() {
        return ResponseEntity.ok(subjectTeacherService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody SubjectTeacher product) {
        return ResponseEntity.ok(subjectTeacherService.save(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubjectTeacher> findById(@PathVariable String id) {
        Optional<SubjectTeacher> subjectTeacher = subjectTeacherService.findById(id);
        if (!subjectTeacher.isPresent()) {
            
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(subjectTeacher.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubjectTeacher> update(@PathVariable String id, @Valid @RequestBody SubjectTeacher product) {
        if (!subjectTeacherService.findById(id).isPresent()) {
            
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(subjectTeacherService.save(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        if (!subjectTeacherService.findById(id).isPresent()) {
          
            ResponseEntity.badRequest().build();
        }

        subjectTeacherService.deleteById(id);

        return ResponseEntity.ok().build();
    }

}
