package ac.in.erp.admission_module.controller;

import ac.in.erp.admission_module.model.StudCaller1;
import ac.in.erp.admission_module.model.StudentManager;
import ac.in.erp.admission_module.repository.StudCaller1Repo;
import ac.in.erp.admission_module.repository.StudManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class StudManagerController {

    @Autowired
    private StudManagerRepo studManagerRepo;
    @Autowired
    private StudCaller1Repo studCaller1Repo;

    @GetMapping("/student_manager")
    public List<StudentManager> getAllDetail(){
        return studManagerRepo.findAll();
    }
    @GetMapping("/student_caller1")
    public  List<StudCaller1> getAllStud(){
        return studCaller1Repo.findAll();
    }

    @PostMapping("/student_manager")
    public StudentManager createDetails(@RequestBody StudentManager at) {return studManagerRepo.save(at);}
}
