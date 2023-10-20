package com.resellerapp.repository;

import com.resellerapp.model.entity.OfferEntity;
import com.resellerapp.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<OfferEntity, Long> {
    UserEntity findByUsername(String username);
}
