package pvxdv.springfamework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pvxdv.springfamework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
