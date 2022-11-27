package org.demo.repository;

import org.demo.model.PermissionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<PermissionModel,Integer> {
}
