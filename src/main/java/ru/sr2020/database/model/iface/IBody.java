package ru.sr2020.database.model.iface;

import ru.sr2020.database.model.pojo.BodyMods;
import ru.sr2020.database.model.pojo.Character;

import java.util.Set;


/**
 * Object interface mapping for hibernate-handled table: body.
 *
 * @author autogenerated
 */

public interface IBody {


    /**
     * Adds a bi-directional link of type BodyMods to the bodyModss set.
     *
     * @param bodyMods item to add
     */
    void addBodyMods(BodyMods bodyMods);

    /**
     * Return the value associated with the column: isactive.
     *
     * @return A Boolean object (this.isactive)
     */
    Boolean Isactive();

    /**
     * Set the value related to the column: isactive.
     *
     * @param isactive the isactive value you wish to set
     */
    void setIsactive(final Boolean isactive);

    /**
     * Return the value associated with the column: bodyMods.
     *
     * @return A Set&lt;BodyMods&gt; object (this.bodyMods)
     */
    Set<BodyMods> getBodyModss();

    /**
     * Set the value related to the column: bodyMods.
     *
     * @param bodyMods the bodyMods value you wish to set
     */
    void setBodyModss(final Set<BodyMods> bodyMods);

    /**
     * Return the value associated with the column: bodytype.
     *
     * @return A Integer object (this.bodytype)
     */
    Integer getBodytype();

    /**
     * Set the value related to the column: bodytype.
     *
     * @param bodytype the bodytype value you wish to set
     */
    void setBodytype(final Integer bodytype);

    /**
     * Return the value associated with the column: character.
     *
     * @return A Character object (this.character)
     */
    Character getCharacter();

    /**
     * Set the value related to the column: character.
     *
     * @param character the character value you wish to set
     */
    void setCharacter(final Character character);

    /**
     * Return the value associated with the column: curhp.
     *
     * @return A Integer object (this.curhp)
     */
    Integer getCurhp();

    /**
     * Set the value related to the column: curhp.
     *
     * @param curhp the curhp value you wish to set
     */
    void setCurhp(final Integer curhp);

    /**
     * Return the value associated with the column: id.
     *
     * @return A Long object (this.id)
     */
    Long getId();

    /**
     * Set the value related to the column: id.
     *
     * @param id the id value you wish to set
     */
    void setId(final Long id);

    /**
     * Return the value associated with the column: maxhp.
     *
     * @return A Integer object (this.maxhp)
     */
    Integer getMaxhp();


    /**
     * Set the value related to the column: maxhp.
     *
     * @param maxhp the maxhp value you wish to set
     */
    void setMaxhp(final Integer maxhp);

    // end of interface
}