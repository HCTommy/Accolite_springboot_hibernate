package org.demo.repository;

import org.demo.model.UserDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDetailsRepository extends JpaRepository<UserDetailsModel,Integer> {

    @Query("select u FROM UserDetailsModel u, LoginModel l where u.loginId=l.id and l.status='active'")
//    @Query("select u FROM UserDetailsModel u")
    List<UserDetailsModel> findAllActiveUsers();
}
