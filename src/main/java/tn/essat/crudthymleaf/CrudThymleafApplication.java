package tn.essat.crudthymleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.essat.crudthymleaf.dao.UsersRepo;
import tn.essat.crudthymleaf.entity.Users;

@SpringBootApplication
public class CrudThymleafApplication implements CommandLineRunner {

    @Autowired
     private UsersRepo usersRepo;
    public static void main(String[] args) {
        SpringApplication.run(CrudThymleafApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


usersRepo.save(new Users("aa","bb","cc",false));

    }
}
