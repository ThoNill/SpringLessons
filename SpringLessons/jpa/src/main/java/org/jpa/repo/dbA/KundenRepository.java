package org.jpa.repo.dbA;
import org.jpa.entities.dbA.A;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;



public interface KundenRepository extends JpaRepository<A, Integer>{ 

}