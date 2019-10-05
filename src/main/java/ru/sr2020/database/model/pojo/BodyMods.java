package ru.sr2020.database.model.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sr2020.database.model.iface.IBodyMods;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


@Entity
@Data
@EqualsAndHashCode()
@Table(name = "body_mods", catalog = "sr2020", schema = "public")
public class BodyMods implements Cloneable, Serializable, IBodyMods {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 2109045246797543178L;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinColumn(name = "body_id", referencedColumnName = "id", nullable = true)
    // @Valid
    private Body body;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinColumn(name = "body_mod_type", referencedColumnName = "id", nullable = true)
    // @Valid
    private Bodymodtype bodyModType;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bodyModsIdGenerator")
    @NotEmpty
    @Column(name = "id")
    @SequenceGenerator(name = "bodyModsIdGenerator", sequenceName = "body_mods_id_seq", schema = "public", catalog = "sr2020", allocationSize = 1)
    private Integer id;


}
