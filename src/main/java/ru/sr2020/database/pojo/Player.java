package ru.sr2020.database.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

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

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "player_id")
  private List<Character> characters;
}
