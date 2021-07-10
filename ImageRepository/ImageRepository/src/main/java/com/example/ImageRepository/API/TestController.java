package com.example.ImageRepository.API;

import com.example.ImageRepository.models.TestTable;
import com.example.ImageRepository.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test/")
@CrossOrigin
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/getData")
    public List<TestTable> testGetData() {
        return  testService.getTestData();
    }
}
