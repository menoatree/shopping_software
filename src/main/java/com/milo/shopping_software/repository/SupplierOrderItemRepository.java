package com.milo.shopping_software.repository;




import com.milo.shopping_software.model.SupplierOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierOrderItemRepository extends JpaRepository<SupplierOrderItem, Integer> {


}
