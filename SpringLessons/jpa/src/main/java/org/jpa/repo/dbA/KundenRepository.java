package org.jpa.repo.dbA;
import org.jpa.entities.dbA.A;
import org.springframework.data.jpa.repository.JpaRepository;



public interface KundenRepository extends JpaRepository<A, Integer>{ 

}