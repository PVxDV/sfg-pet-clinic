package pvxdv.springfamework.sfgpetclinic.services;

import pvxdv.springfamework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
