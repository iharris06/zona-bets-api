package model;

import lombok.Data;

import java.util.UUID;

@Data
public class Contest {
    private final UUID id = UUID.randomUUID();
    private String title;
    private String result;

    public Contest(String title){
        this.title = title;
    }

    public Contest(String title, String result){
        this.title = title;
        this.result = result;
    }
}
