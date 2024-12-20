package vn.edu.iuh.fit.ontapcuoikysecurity1.pks;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.Order;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.Product;

import java.io.Serializable;

@Setter @Getter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
