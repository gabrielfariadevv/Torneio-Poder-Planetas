package com.projeto.torneio.repositories;

import com.projeto.torneio.models.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
