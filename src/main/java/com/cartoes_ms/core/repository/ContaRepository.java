package com.cartoes_ms.core.repository;

import com.cartoes_ms.core.entity.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Integer> {
}
