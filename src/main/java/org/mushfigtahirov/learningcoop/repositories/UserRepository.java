package org.mushfigtahirov.learningcoop.repositories;

import org.mushfigtahirov.learningcoop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
// This class contains one custom query
public interface UserRepository extends JpaRepository<User, Integer> {
User findByUsername(String username);
}
