package com.wellinbraga.dsmovie.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellinbraga.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
