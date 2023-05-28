package com.example.sync_intern_local_train_ticket_management_system.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserLogin {
    private String Username;

    @Override
    public String toString() {
        return "UserLogin{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    private String Password;
}
