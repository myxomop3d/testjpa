package ru.sr2020.database.model.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.sr2020.database.model.iface.ISin;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Data
@EqualsAndHashCode()
@Table(name = "sin", catalog = "sr2020", schema = "public")
public class Sin implements Cloneable, Serializable, ISin {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 686466028988891953L;


    private Integer citizenship;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sinIdGenerator")
    @NotEmpty
    @Column(name = "id")
    @SequenceGenerator(name = "sinIdGenerator", sequenceName = "sin_id_seq", schema = "public", catalog = "sr2020", allocationSize = 1)
    private Integer id;

    @Size(max = 2147483647)
    @Column(length = 2147483647)
    private String personname;

    private Integer race;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = true)
    // @Valid
    private Character role;

    @Size(max = 2147483647)
    @Column(length = 2147483647)
    private String sintext;


}
