package vn.edu.iuh.fit.ontapcuoikysecurity1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.Product;
import vn.edu.iuh.fit.ontapcuoikysecurity1.repositories.ProductRepository;


@Service
public class ProductServices {
    @Autowired
    private ProductRepository productRepository;

    public Page<Product> findPaginated(int pageNo, int pageSize, String sortBy, String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return productRepository.findAll(pageable);
    }


}
