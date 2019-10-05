package ru.sr2020.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sr2020.database.pojo.Character;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository <Character, Long>{
    List<Character> findByhackerlogin(String hackerlogin);
}
