package org.jpa.repo.dbB;

import org.jpa.entities.dbB.B;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RechnungRepository extends JpaRepository<B, Integer>{ 

}