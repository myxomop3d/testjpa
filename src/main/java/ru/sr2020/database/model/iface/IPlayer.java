package ru.sr2020.database.model.iface;

import ru.sr2020.database.model.pojo.Character;

import java.util.Set;


/**
 * Object interface mapping for hibernate-handled table: player.
 *
 * @author autogenerated
 */

public interface IPlayer {


    /**
     * Adds a bi-directional link of type Character to the characters set.
     *
     * @param character item to add
     */
    void addCharacter(Character character);

    /**
     * Return the value associated with the column: character.
     *
     * @return A Set&lt;Character&gt; object (this.character)
     */
    Set<Character> getCharacters();

    /**
     * Set the value related to the column: character.
     *
     * @param character the character value you wish to set
     */
    void setCharacters(final Set<Character> character);

    /**
     * Return the value associated with the column: fio.
     *
     * @return A String object (this.fio)
     */
    String getFio();


    /**
     * Set the value related to the column: fio.
     *
     * @param fio the fio value you wish to set
     */
    void setFio(final String fio);

    /**
     * Return the value associated with the column: id.
     *
     * @return A Integer object (this.id)
     */
    Integer getId();


    /**
     * Set the value related to the column: id.
     *
     * @param id the id value you wish to set
     */
    void setId(final Integer id);

    /**
     * Return the value associated with the column: joinid.
     *
     * @return A Integer object (this.joinid)
     */
    Integer getJoinid();


    /**
     * Set the value related to the column: joinid.
     *
     * @param joinid the joinid value you wish to set
     */
    void setJoinid(final Integer joinid);

    // end of interface
}
