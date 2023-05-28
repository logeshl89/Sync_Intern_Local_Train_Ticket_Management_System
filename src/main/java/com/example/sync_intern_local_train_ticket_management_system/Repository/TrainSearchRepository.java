package com.example.sync_intern_local_train_ticket_management_system.Repository;

import com.example.sync_intern_local_train_ticket_management_system.Entity.TrainSearchForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrainSearchRepository extends JpaRepository<TrainSearchForm, Long> {
    List<TrainSearchForm> findBySourceAndDestinationAndDateAndTrainType(String src, String des, String date, String type);

    List<TrainSearchForm> findBySourceAndDestinationAndDate(String src, String desc, String date);


}
