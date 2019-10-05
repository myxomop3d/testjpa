package ru.sr2020.database.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.sr2020.database.model.pojo.BodyMods;

/**
 * Spring Data Repository for table: body_mods.
 *
 * @author autogenerated/custom
 */
public interface BodyModsRepository extends JpaRepository<BodyMods, Integer>, QuerydslPredicateExecutor<BodyMods> {

    // Add any extra methods here. This file will not get overwritten unlike any other generated file
}
