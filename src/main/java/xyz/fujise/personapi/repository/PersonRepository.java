package xyz.fujise.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.fujise.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
