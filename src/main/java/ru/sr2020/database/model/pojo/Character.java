package ru.sr2020.database.model.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sr2020.database.model.iface.ICharacter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@EqualsAndHashCode(exclude = {"bodies", "sins"})
@ToString(exclude = {"bodies", "sins"})
@Table(name = "character", catalog = "sr2020", schema = "public")
public class Character implements Cloneable, Serializable, ICharacter {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 8548973727659841685L;


    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "character")
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    // @Valid
    private Set<Body> bodies = new HashSet<>();

    @Size(max = 2147483647)
    @Column(length = 2147483647)
    private String hackerlogin;

    @Size(max = 2147483647)
    @Column(length = 2147483647)
    private String hackerpwd;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "characterIdGenerator")
    @NotEmpty
    @Column(name = "id")
    @SequenceGenerator(name = "characterIdGenerator", sequenceName = "character_id_seq", schema = "public", catalog = "sr2020", allocationSize = 1)
    private Integer id;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinColumn(name = "player_id", referencedColumnName = "id", nullable = true)
    // @Valid
    private Player player;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "role")
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    // @Valid
    private Set<Sin> sins = new HashSet<>();

    @Size(max = 2147483647)
    @Column(length = 2147483647)
    private String status;

    private Integer truerace;


    /**
     * Adds a bi-directional link of type Body to the bodies set.
     *
     * @param body item to add
     */
    public void addBody(Body body) {
        body.setCharacter(this);
        this.bodies.add(body);
    }

    /**
     * Adds a bi-directional link of type Sin to the sins set.
     *
     * @param sin item to add
     */
    public void addSin(Sin sin) {
        sin.setRole(this);
        this.sins.add(sin);
    }


}
