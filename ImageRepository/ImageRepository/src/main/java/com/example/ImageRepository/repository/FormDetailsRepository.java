package com.example.ImageRepository.repository;

import com.example.ImageRepository.models.FormDetails;
import com.example.ImageRepository.models.TopDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FormDetailsRepository  extends JpaRepository<FormDetails, Integer> {

    @Query(value = "SELECT loc_name as name, count(loc.loc_id) as count \n" +
            "FROM form_details  form\n" +
            "LEFT JOIN location_table loc on\n" +
            " form.loc_id = loc.loc_id \n" +
            "group by loc.loc_id order by count(loc.loc_id) DESC  LIMIT 5", nativeQuery = true)
    List<TopDetails> getLocationCounts();

    @Query(value = "SELECT I_USER_ID as name, count(I_USER_ID) as count FROM form_details group by I_USER_ID order by count(I_USER_ID) DESC  LIMIT 5", nativeQuery = true)
    List<TopDetails> getUserCounts();
}
