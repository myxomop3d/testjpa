package ru.sr2020.testjpa.database.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/*@Table(name = "body")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate

public class Body {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int bodytype;
    private long maxhp;
    private long curhp;
    private String isactive;
    private long character_id;

/*
    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }


    public long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }


    public long getCurhp() {
        return curhp;
    }

    public void setCurhp(long curhp) {
        this.curhp = curhp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "isactive")
    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    @Column(name = "maxhp")
    public long getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(long maxhp) {
        this.maxhp = maxhp;
    }
}
*/
