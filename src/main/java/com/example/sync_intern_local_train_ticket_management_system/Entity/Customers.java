package com.example.sync_intern_local_train_ticket_management_system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String from;
    private String destination;
    private Integer noOfKids;
    private Integer noOfAdults;
    private Integer noOfSeniors;
    private Integer userid;
    private Boolean status=false;

    @Override
    public String toString() {
        return "TrainTicketBooking{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", destination='" + destination + '\'' +
                ", noOfKids=" + noOfKids +
                ", noOfAdults=" + noOfAdults +
                ", noOfSeniors=" + noOfSeniors +
                ", userid=" + userid +
                ", status=" + status +
                '}';
    }
}
