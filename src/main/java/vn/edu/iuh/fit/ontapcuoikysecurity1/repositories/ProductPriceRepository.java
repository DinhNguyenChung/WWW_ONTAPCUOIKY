package vn.edu.iuh.fit.ontapcuoikysecurity1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.Product;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.ProductPrice;


public interface ProductPriceRepository extends JpaRepository<ProductPrice, Product>, JpaSpecificationExecutor<ProductPrice> {
}