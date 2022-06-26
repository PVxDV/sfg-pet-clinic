package pvxdv.springfamework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pvxdv.springfamework.sfgpetclinic.model.Specialty;
import pvxdv.springfamework.sfgpetclinic.services.SpecialtiesService;

import java.util.Set;

@Service
public class SpecialtiesServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtiesService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return super.save(specialty);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
