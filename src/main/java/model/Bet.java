package model;

import lombok.Data;

import java.util.UUID;

@Data
public class Bet {
    private final UUID id = UUID.randomUUID();
    private UUID personId;
    private UUID contestId;
    private double amount;
    public Bet(UUID personId, UUID contestId, double amount) {
        this.amount = amount;
        this.personId = personId;
        this.contestId = contestId;
    }
}
