
package com.reto1.ciclo4.reto1;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.reto1.ciclo4.reto1.User;


public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findByName(String name);
}
