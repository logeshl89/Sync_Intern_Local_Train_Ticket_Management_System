package com.example.sync_intern_local_train_ticket_management_system.Service;

import com.example.sync_intern_local_train_ticket_management_system.Entity.TrainSearchForm;
import com.example.sync_intern_local_train_ticket_management_system.Repository.TrainSearchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFilter {
    private final TrainSearchRepository trainSearchRepository;

    public SearchFilter(TrainSearchRepository trainSearchRepository) {
        this.trainSearchRepository = trainSearchRepository;
    }

    public List<TrainSearchForm> GetTheTrains(TrainSearchForm trainSearchForm) {
        if (trainSearchForm.getTrainType().equals("all")) {
            return trainSearchRepository.findBySourceAndDestinationAndDate(trainSearchForm.getSource(),
                    trainSearchForm.getDestination(), trainSearchForm.getDate());
        }

        return trainSearchRepository.findBySourceAndDestinationAndDateAndTrainType(trainSearchForm.getSource()
                , trainSearchForm.getDestination(), trainSearchForm.getDate(), trainSearchForm.getTrainType());
    }

    public String FindTrainNameById(long id) {

            return trainSearchRepository.findById(id).get().getTrainName();
    }
}
