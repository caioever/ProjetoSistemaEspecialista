package com.uva.ia.motordeinferencia.arvore.repository;

import com.uva.ia.motordeinferencia.arvore.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepository extends JpaRepository<Node, Long> {
    Node findById(long id);
}
