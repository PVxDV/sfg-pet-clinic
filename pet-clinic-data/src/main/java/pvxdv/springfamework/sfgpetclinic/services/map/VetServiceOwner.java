package pvxdv.springfamework.sfgpetclinic.services.map;

import pvxdv.springfamework.sfgpetclinic.model.Vet;
import pvxdv.springfamework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceOwner extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
