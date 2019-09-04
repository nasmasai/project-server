package com.mainServer.Repositories;

import com.mainServer.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    List<Movie> findByCategoryId(Long id);
}
