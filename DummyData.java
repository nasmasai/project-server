package com.mainServer;

import com.mainServer.Model.Category;
import com.mainServer.Model.Movie;
import com.mainServer.Repositories.CategoryRepository;
import com.mainServer.Repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

public class DummyData implements CommandLineRunner {
    public DummyData(CategoryRepository categoryController, MovieRepository movieRepository) {
        this.categoryRepository = categoryController;
        this.movieRepository = movieRepository;
    }
    private final CategoryRepository categoryRepository;
    private final MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {
      Category drama = new Category("Drama", "Romance");
      Category action = new Category("Action", "Drama");
      categoryRepository.saveAll(Arrays.asList(drama, action));

        Movie movie1 = new Movie("GOT", drama);
        movieRepository.save(movie1);
        Movie movie2 = new Movie("POWER",action);
        movieRepository.save(movie2);

    }




}
