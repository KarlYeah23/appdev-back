package com.dalangin.ecom.repository;

import com.dalangin.ecom.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {


    boolean existsByCode(String code);


}
