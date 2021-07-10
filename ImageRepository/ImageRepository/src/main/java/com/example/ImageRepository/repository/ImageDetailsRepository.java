package com.example.ImageRepository.repository;

import com.example.ImageRepository.models.ImageDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDetailsRepository  extends JpaRepository<ImageDetails, Integer> {
}
