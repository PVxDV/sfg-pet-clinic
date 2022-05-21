package pvxdv.springfamework.sfgpetclinic.services;

import pvxdv.springfamework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
