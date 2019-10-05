package ru.sr2020.database.model.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sr2020.database.model.iface.IPlayer;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@EqualsAndHashCode(exclude = {"characters"})
@ToString(exclude = {"characters"})
@Table(name = "player", catalog = "sr2020", schema = "public")
public class Player implements Cloneable, Serializable, IPlayer {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 7164560511411968768L;


    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "player")
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    // @Valid
    private Set<Character> characters = new HashSet<>();

    @Size(max = 2147483647)
    @Column(length = 2147483647)
    private String fio;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "playerIdGenerator")
    @NotEmpty
    @Column(name = "id")
    @SequenceGenerator(name = "playerIdGenerator", sequenceName = "player_id_seq", schema = "public", catalog = "sr2020", allocationSize = 1)
    private Integer id;

    private Integer joinid;


    /**
     * Adds a bi-directional link of type Character to the characters set.
     *
     * @param character item to add
     */
    public void addCharacter(Character character) {
        character.setPlayer(this);
        this.characters.add(character);
    }


}
