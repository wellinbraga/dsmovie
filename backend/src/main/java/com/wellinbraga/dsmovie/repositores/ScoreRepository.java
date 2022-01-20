package com.wellinbraga.dsmovie.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellinbraga.dsmovie.entities.Score;
import com.wellinbraga.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
