package com.example.testgroupproject.Services;

import com.example.testgroupproject.Models.Producer;
import com.example.testgroupproject.Repositories.ProducerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpProducerService implements ProducerServiceInterface{

    @Autowired
    ProducerRepo producerRepo;

    @Override
    public void insertProducer(Producer p) {
        Producer savedProducer = producerRepo.save(p);
    }

    @Override
    public List<Producer> getAllProducers() {
        return producerRepo.findAll();
    }
}
