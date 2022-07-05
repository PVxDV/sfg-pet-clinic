package pvxdv.springfamework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pvxdv.springfamework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
