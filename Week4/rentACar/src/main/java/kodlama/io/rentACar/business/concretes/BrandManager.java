package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BranRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //Bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService {

    private BranRepository branRepository;

    @Autowired
    public BrandManager(BranRepository branRepository) {
        super();
        this.branRepository = branRepository;
    }

    @Override
    public List<Brand> getAll() {
        //iş kuralları
        return branRepository.getAll();
    }
}
