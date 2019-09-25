package ru.sr2020.testjpa.database.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Table(name = "character")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Character {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "character_id_seq")
  private int id;

    @Column
    private String hackerlogin;
    @Column
    private String hackerpwd;
    @Column
    private String status;
    @Column
    private int player_id;
    @Column
    private int sin;
    @Column
    private int truerace;
}
