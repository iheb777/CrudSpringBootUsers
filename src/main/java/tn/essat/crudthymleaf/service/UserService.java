package tn.essat.crudthymleaf.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.essat.crudthymleaf.dao.UsersRepo;
import tn.essat.crudthymleaf.entity.Users;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private  UsersRepo usersRepo;
    public List getAll(){
        return usersRepo.findAll();

    }
    public void save(Users users){
        usersRepo.save(users);
    }
    public Users getByID(Long id){
        return (Users) usersRepo.findById(id).get();
    }
    public void delete(Long id){
        usersRepo.delete(getByID(id));
    }
    public void update(Users u){
        usersRepo.save(u);
    }
}
