package com.example.ImageRepository.services;

import com.example.ImageRepository.models.TestTable;
import com.example.ImageRepository.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public List<TestTable> getTestData() {
        return testRepository.findAll();
    }
}
