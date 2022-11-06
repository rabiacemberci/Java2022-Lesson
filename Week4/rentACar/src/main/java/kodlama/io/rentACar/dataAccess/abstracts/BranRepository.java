package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;


import java.util.List;

public interface BranRepository {
    List<Brand> getAll();

}
