package com.example.project2.programme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgrammeRepository extends JpaRepository<Programme, Long> {
    @Query("SELECT p FROM Programme p WHERE p.name = ?1")
    Optional<Programme> findProgrammeByName(String name);
}
