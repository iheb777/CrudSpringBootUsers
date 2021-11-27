package tn.essat.crudthymleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.essat.crudthymleaf.entity.Users;

public interface UsersRepo extends JpaRepository<Users,Long> {

}
