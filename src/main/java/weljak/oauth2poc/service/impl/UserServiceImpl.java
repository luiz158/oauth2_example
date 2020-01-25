package weljak.oauth2poc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weljak.oauth2poc.dao.UserDao;
import weljak.oauth2poc.model.AppUser;
import weljak.oauth2poc.service.UserService;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(@Autowired final UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<AppUser> findAll() {
        List<AppUser> list = new ArrayList<>();
        userDao.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void delete(long id) {
        userDao.deleteById(id);
    }

    @Override
    public AppUser save(AppUser appUser) {
        return userDao.save(appUser);
    }

    @Override
    public AppUser findByUsername(final String username) {
        System.out.println("POBIERANIE DLA " + username);
        final AppUser res = userDao.findByUsername(username);
        System.out.println(res);
        return res;
    }

    //    @PostConstruct
//	public void setup(){
//		User user = new User();
//		user.setUsername("admin@admin.pl");
//		user.setPassword("admin");
//		user.setAge(25);
//		user.setSalary(1300);
//		save(user);
//	}
}
