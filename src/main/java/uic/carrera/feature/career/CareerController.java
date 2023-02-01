package uic.carrera.feature.career;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/career")
@CrossOrigin({ "*" })

public class CareerController {
    
    @Autowired
    CareerService careerService;

    @GetMapping("/{id}/")
    public Career findById(@PathVariable Long id) {
        return careerService.findById(id);
    }

    @GetMapping("/")
    public List<Career> findAll() {
        return careerService.findAll();
    }

    @PostMapping("/")
    public Career save(@RequestBody Career entity) {
        return careerService.save(entity);
    }

    @PutMapping("/{id}/")
    public Career update(@RequestBody Career entity) {
        return careerService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        careerService.deleteById(id);
    }
}
