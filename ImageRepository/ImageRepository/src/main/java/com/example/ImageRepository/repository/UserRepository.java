package com.example.ImageRepository.repository;

import com.example.ImageRepository.models.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface UserRepository extends JpaRepository<UserTable, Integer> {

    @Query(value = "SELECT I_USER_ID, VC_USERNAME FROM tbl_users WHERE VC_USERNAME =:user AND VC_PASSWORD =:pass", nativeQuery = true)
    UserTable findIfUserExists(String user, String pass);
}
