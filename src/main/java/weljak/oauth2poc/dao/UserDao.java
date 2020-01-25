package weljak.oauth2poc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import weljak.oauth2poc.model.AppUser;

@Repository
public interface UserDao extends CrudRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
