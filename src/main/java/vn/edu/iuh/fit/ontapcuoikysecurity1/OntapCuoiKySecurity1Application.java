package vn.edu.iuh.fit.ontapcuoikysecurity1;

import jakarta.transaction.Transactional;
import net.datafaker.Faker;
import net.datafaker.providers.base.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.ontapcuoikysecurity1.enums.ProductStatus;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.Product;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.ProductImage;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.ProductPrice;
import vn.edu.iuh.fit.ontapcuoikysecurity1.repositories.ProductImageRepository;
import vn.edu.iuh.fit.ontapcuoikysecurity1.repositories.ProductPriceRepository;
import vn.edu.iuh.fit.ontapcuoikysecurity1.repositories.ProductRepository;

import java.time.LocalDateTime;
import java.util.Random;

@SpringBootApplication
public class OntapCuoiKySecurity1Application {

    public static void main(String[] args) {
        SpringApplication.run(OntapCuoiKySecurity1Application.class, args);
    }

//    @Autowired
//    private ProductRepository productRepository;
//    @Autowired
//    private ProductPriceRepository productPriceRepository;
//    @Autowired
//    private ProductImageRepository productImageRepository;
//
//    @Bean
//    @Transactional
//    CommandLineRunner createSampleProducts() {
//        return args -> {
//            Faker faker = new Faker();
//            Random rnd = new Random();
//            Device devices = faker.device();
//            for (int i = 0; i < 200; i++) {
//
//                Product product = new Product(
//                        devices.modelName(),
//                        faker.lorem().paragraph(30),
////                        rnd.nextInt(10)%2==0?"Kg":"piece",
//                        "piece",
//                        devices.manufacturer(),
//                        ProductStatus.ACTIVE
//                );
//
//
//
//                ProductImage img = new ProductImage("assets/img-sample.png", "sample image");
//                img.setProduct(product);
//
//                ProductPrice price = new ProductPrice(LocalDateTime.now(), rnd.nextInt(1500), "Note #" + i);
//                price.setProduct(product);
//
//                productRepository.save(product);
//                productImageRepository.save(img);
//                productPriceRepository.save(price);
//            }
//        };
//    }

}
