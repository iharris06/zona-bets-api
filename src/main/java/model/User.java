package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class User {
    private final UUID id = UUID.randomUUID();;
    private String name;
    private float bank;

    public User(String name){
        this.bank = 123;
        this.name = name;
    }

}
