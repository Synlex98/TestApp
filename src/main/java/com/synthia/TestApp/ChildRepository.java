package com.synthia.TestApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChildRepository extends JpaRepository<Child,Long> {
    @Query("select c from Child c where upper(c.name) like upper(concat('%', ?1, '%'))")
    List<Child> findByName(@NonNull String name);
    @Query("select c from Child c where upper(c.name) like upper(concat('%', ?1, '%'))")
    Optional<Child> findByNameContainsIgnoreCase(@NonNull String name);
}
