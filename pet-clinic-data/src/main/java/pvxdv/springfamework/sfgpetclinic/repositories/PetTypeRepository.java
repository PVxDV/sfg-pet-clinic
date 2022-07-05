package pvxdv.springfamework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pvxdv.springfamework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
