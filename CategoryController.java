package com.mainServer.Controller;

import com.mainServer.Model.Category;
import com.mainServer.Model.Movie;
import com.mainServer.Repositories.CategoryRepository;
import com.mainServer.Repositories.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//localhost:8080/categories
@RestController
@RequestMapping(value = "categories")
public class CategoryController {

    private final CategoryRepository categoryRepository;
    private final MovieRepository movieRepository;

    public CategoryController(CategoryRepository categoryRepository, MovieRepository movieRepository) {
        this.categoryRepository = categoryRepository;
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public List<Category>getAllCategories(){
        return categoryRepository.findAll();
    }
    @GetMapping(value = "{id}")
    public Category findOneById(@PathVariable Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }

    @GetMapping(value = "{categoryId}/movies")
    public List<Movie> findByCategoryId(@PathVariable Long categoryId){
    return movieRepository.findByCategoryId(categoryId);
    }
}
