package com.example.ImageRepository.services;

import com.example.ImageRepository.models.FormDetails;
import com.example.ImageRepository.models.TopContributions;
import com.example.ImageRepository.repository.FormDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormSubmissionService {

    @Autowired
    FormDetailsRepository formDetailsRepository;

    public void submitForm(FormDetails formDetails) {
        formDetailsRepository.save(formDetails);
    }

    public TopContributions getCounts() {
        TopContributions topContributions = new TopContributions();
        topContributions.setTopFiveContributors(formDetailsRepository.getUserCounts());
        topContributions.setTopFiveLocations(formDetailsRepository.getLocationCounts());
        return  topContributions;
    }


}
