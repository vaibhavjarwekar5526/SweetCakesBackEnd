package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.MyOrder;
import net.javaguides.springboot.model.Order;
import net.javaguides.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.User;

@Repository
public interface MyOrderRepository extends JpaRepository<MyOrder, String>{

}
