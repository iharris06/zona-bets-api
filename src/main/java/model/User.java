package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class User {
    private UUID id;
    private String name;
    private float bank;

    public User(String name){
        this.id = UUID.randomUUID();
        this.bank = 123;
        this.name = name;
    }

}
