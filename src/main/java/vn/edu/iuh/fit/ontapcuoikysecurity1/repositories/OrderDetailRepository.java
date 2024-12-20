package vn.edu.iuh.fit.ontapcuoikysecurity1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.Order;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.OrderDetail;


public interface OrderDetailRepository extends JpaRepository<OrderDetail, Order>, JpaSpecificationExecutor<OrderDetail> {
}