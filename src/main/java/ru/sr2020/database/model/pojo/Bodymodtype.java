package ru.sr2020.database.model.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.sr2020.database.model.iface.IBodymodtype;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@EqualsAndHashCode(exclude = {"bodyModss"})
@ToString(exclude = {"bodyModss"})
@Table(name = "bodymodtype", catalog = "sr2020", schema = "public")
public class Bodymodtype implements Cloneable, Serializable, IBodymodtype {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 5999963451002732450L;


    @Size(max = 2147483647)
    @Column(name = "addition_type", length = 2147483647)
    private String additionType;

    @Column(name = "addition_val")
    private Integer additionVal;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "bodyModType")
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    // @Valid
    private Set<BodyMods> bodyModss = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bodymodtypeIdGenerator")
    @NotEmpty
    @Column(name = "id")
    @SequenceGenerator(name = "bodymodtypeIdGenerator", sequenceName = "bodymodtype_id_seq", schema = "public", catalog = "sr2020", allocationSize = 1)
    private Integer id;

    @Size(max = 2147483647)
    @Column(length = 2147483647)
    private String name;


    /**
     * Adds a bi-directional link of type BodyMods to the bodyModss set.
     *
     * @param bodyMods item to add
     */
    public void addBodyMods(BodyMods bodyMods) {
        bodyMods.setBodyModType(this);
        this.bodyModss.add(bodyMods);
    }


}
