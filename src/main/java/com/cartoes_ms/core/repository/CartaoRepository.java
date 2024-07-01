package com.cartoes_ms.core.repository;

import com.cartoes_ms.core.entity.CartaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<CartaoEntity, Integer> {
}
