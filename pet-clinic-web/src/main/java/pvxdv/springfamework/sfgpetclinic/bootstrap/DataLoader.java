package pvxdv.springfamework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pvxdv.springfamework.sfgpetclinic.model.Owner;
import pvxdv.springfamework.sfgpetclinic.model.Vet;
import pvxdv.springfamework.sfgpetclinic.services.OwnerService;
import pvxdv.springfamework.sfgpetclinic.services.VetService;
import pvxdv.springfamework.sfgpetclinic.services.map.OwnerServiceMap;
import pvxdv.springfamework.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1  = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2  = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Brown");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1  = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2  = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Alex");
        vet2.setLastName("Car");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
