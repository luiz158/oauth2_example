package weljak.oauth2poc.service;


import weljak.oauth2poc.model.AppUser;

import java.util.List;

public interface UserService {

    AppUser save(AppUser appUser);

    List<AppUser> findAll();

    void delete(long id);

    AppUser findByUsername(final String username);
}
