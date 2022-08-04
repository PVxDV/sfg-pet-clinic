package pvxdv.springfamework.sfgpetclinic.services;

import pvxdv.springfamework.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findByLastNameLike(String lastName);

}
