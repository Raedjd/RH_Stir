package tn.stir.rh.mangement.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.stir.rh.mangement.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
