package com.uva.ia.motordeinferencia.questoes.repository;

import com.uva.ia.motordeinferencia.questoes.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findById(long id);
}
