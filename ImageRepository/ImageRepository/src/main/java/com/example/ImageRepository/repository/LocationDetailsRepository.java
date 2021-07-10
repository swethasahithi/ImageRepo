package com.example.ImageRepository.repository;

import com.example.ImageRepository.models.LocationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationDetailsRepository extends JpaRepository<LocationDetails, Integer> {
}
