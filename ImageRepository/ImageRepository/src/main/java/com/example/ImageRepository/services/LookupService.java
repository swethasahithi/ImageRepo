package com.example.ImageRepository.services;

import com.example.ImageRepository.models.ImageDetails;
import com.example.ImageRepository.models.LocationDetails;
import com.example.ImageRepository.repository.ImageDetailsRepository;
import com.example.ImageRepository.repository.LocationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LookupService {
    @Autowired
    ImageDetailsRepository imageDetailsRepository;
    @Autowired
    LocationDetailsRepository locationDetailsRepository;

    public List<ImageDetails> getImageDetails() {
        return imageDetailsRepository.findAll();
    }

    public List<LocationDetails> getLocationDetails() {
        return  locationDetailsRepository.findAll();
    }
}
