package com.example.ImageRepository.API;

import com.example.ImageRepository.models.*;
import com.example.ImageRepository.services.FormSubmissionService;
import com.example.ImageRepository.services.LookupService;
import com.example.ImageRepository.services.TestService;
import com.example.ImageRepository.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@CrossOrigin
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    UserService userService;

    @Autowired
    LookupService lookupService;

    @Autowired
    FormSubmissionService formSubmissionService;

    @GetMapping("/getData")
    public List<TestTable> testGetData() {
        return testService.getTestData();
    }

    @GetMapping("/getUserDetails")
    public UserTable getUserData(@RequestParam("user") String user, @RequestParam("pass") String password) {
        return userService.getUserDetails(user, password);
    }

    @GetMapping("/getImageDetails")
    public List<ImageDetails> getImageDetails() {
        return lookupService.getImageDetails();
    }

    @GetMapping("/getLocationDetails")
    public List<LocationDetails> getLocationDetails() {
        return lookupService.getLocationDetails();
    }

    @GetMapping("/getCounts")
    public TopContributions getCounts() {
        return formSubmissionService.getCounts();
    }

    @PutMapping("/uploadFormData")
    public void uploadFormData(@RequestBody FormDetails formDetails) {
        formSubmissionService.submitForm(formDetails);
    }


}
