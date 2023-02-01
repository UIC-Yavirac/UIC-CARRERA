package uic.carrera.feature.career;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Transactional
@Service
public class CareerService {
    @Autowired
    CareerRepository careerRepository;

    @Transactional
    public Career save(Career entity) {
        return careerRepository.save(entity);
    }

    public Career findById(Long id) {
        return careerRepository.findById(id).orElse(new Career());
    }

    public void deleteById(Long id) {
        careerRepository.deleteById(id);
    }

    public List<Career> findAll() {
        return careerRepository.findAll();
    }

}
