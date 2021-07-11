package com.example.ImageRepository.services;

import com.example.ImageRepository.models.FormDetails;
import com.example.ImageRepository.models.LocationDetails;
import com.example.ImageRepository.models.TopContributions;
import com.example.ImageRepository.repository.FormDetailsRepository;
import com.example.ImageRepository.repository.LocationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormSubmissionService {

    @Autowired
    FormDetailsRepository formDetailsRepository;

    @Autowired
    LocationDetailsRepository locationDetailsRepository;

    public void submitForm(FormDetails formDetails) {
        LocationDetails locationDetails = new LocationDetails();
        if(formDetails.getLocId() == null && formDetails.getOtherLocationName() !=null) {
            locationDetails.setName(formDetails.getOtherLocationName());
            locationDetails.setAddress(formDetails.getOtherLocationAddress());
            locationDetails.setPinCode(formDetails.getOtherLocationPinCode());
            locationDetails.setState(formDetails.getOtherLocationPinCode());
            LocationDetails locationDetailsAfterSave = locationDetailsRepository.saveAndFlush(locationDetails);
            formDetails.setLocId(locationDetailsAfterSave.getId());
        }
        formDetailsRepository.saveAndFlush(formDetails);
    }

    public TopContributions getCounts() {
        TopContributions topContributions = new TopContributions();
        topContributions.setTopFiveContributors(formDetailsRepository.getUserCounts());
        topContributions.setTopFiveLocations(formDetailsRepository.getLocationCounts());
        return  topContributions;
    }


}
