package ru.sr2020.testjpa.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sr2020.testjpa.database.pojo.Player;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository <Player, Integer>{
    List<Player> findByFio(String fio);
}
