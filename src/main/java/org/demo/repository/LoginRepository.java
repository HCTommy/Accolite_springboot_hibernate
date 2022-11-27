package org.demo.repository;

import org.demo.model.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepository extends JpaRepository<LoginModel,Integer> {




}
