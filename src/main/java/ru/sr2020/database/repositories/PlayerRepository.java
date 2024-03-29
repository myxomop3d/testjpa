package ru.sr2020.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sr2020.database.pojo.Player;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository <Player, Integer>{
    List<Player> findByFio(String fio);
}
