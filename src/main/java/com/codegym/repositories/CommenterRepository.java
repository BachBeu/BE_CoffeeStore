package com.codegym.repositories;

import com.codegym.models.Commenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommenterRepository extends JpaRepository<Commenter, Long> {
    Iterable<Commenter> findCommentersByProductId(Long productId);
}
