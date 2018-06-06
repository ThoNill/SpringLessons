package org.jpa.repo.dbB;

import org.jpa.entities.dbB.B;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;

public interface RechnungRepository extends JpaRepository<B, Integer>{ 

}