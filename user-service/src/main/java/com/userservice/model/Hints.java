package com.userservice.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hints {
    @Id
    private Integer hintId ;
    private String hints ;

    public Hints() {
    }

    public Integer getHintId() {
        return hintId;
    }

    public void setHintId(Integer hintId) {
        this.hintId = hintId;
    }

    public String getHints() {
        return hints;
    }

    public void setHints(String hints) {
        this.hints = hints;
    }
}
