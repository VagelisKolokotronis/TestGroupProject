package com.example.testgroupproject.Services;

import com.example.testgroupproject.Models.Producer;

import java.util.List;

public interface ProducerServiceInterface {

    void insertProducer(Producer p);

    List<Producer> getAllProducers();
}
