package com.example.ImageRepository.repository;

import com.example.ImageRepository.models.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestTable, Integer> {

}
