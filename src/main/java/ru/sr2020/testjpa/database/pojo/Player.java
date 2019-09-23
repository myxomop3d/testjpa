package ru.sr2020.testjpa.database.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Table(name = "player")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "player_id_seq")
  private int id;
  private String fio;
  private int joinid;
}
