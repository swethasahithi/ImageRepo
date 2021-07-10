package com.example.ImageRepository.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TopContributions {

    private List<TopDetails> topFiveContributors;
    private List<TopDetails> topFiveLocations;
}
