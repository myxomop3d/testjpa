package ru.sr2020.database.model.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sr2020.database.model.iface.IBody;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@EqualsAndHashCode(exclude = {"bodyModss"})
@ToString(exclude = {"bodyModss"})
@Table(name = "body", catalog = "sr2020", schema = "public")
public class Body implements Cloneable, Serializable, IBody {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = -6048304394277731188L;


    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "body")
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    // @Valid
    private Set<BodyMods> bodyModss = new HashSet<>();

    private Integer bodytype;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinColumn(name = "character_id", referencedColumnName = "id", nullable = true)
    // @Valid
    private Character character;

    private Integer curhp;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bodyIdGenerator")
    @NotEmpty
    @Column(name = "id")
    @SequenceGenerator(name = "bodyIdGenerator", sequenceName = "body_id_seq", schema = "public", catalog = "sr2020", allocationSize = 1)
    private Long id;

    private Boolean isactive;

    private Integer maxhp;


    /**
     * Adds a bi-directional link of type BodyMods to the bodyModss set.
     *
     * @param bodyMods item to add
     */
    public void addBodyMods(BodyMods bodyMods) {
        bodyMods.setBody(this);
        this.bodyModss.add(bodyMods);
    }

    @Override
    public Boolean Isactive() {
        return isactive;
    }


}
