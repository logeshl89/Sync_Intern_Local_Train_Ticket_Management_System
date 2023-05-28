package com.example.sync_intern_local_train_ticket_management_system.Repository;

import com.example.sync_intern_local_train_ticket_management_system.Entity.TrainSearchForm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class TrainSearchRepositoryTest {


    private TrainSearchRepository trainSearchRepository;

    TrainSearchRepositoryTest(TrainSearchRepository trainSearchRepository) {
        this.trainSearchRepository = trainSearchRepository;
    }

    @Test
    void getById() {
        Optional<TrainSearchForm> byId1 = trainSearchRepository.findById(2L);
        System.out.println(byId1.get().getTrainName());
    }
}