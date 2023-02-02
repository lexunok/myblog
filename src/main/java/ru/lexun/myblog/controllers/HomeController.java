package ru.lexun.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.lexun.myblog.models.Blog;
import ru.lexun.myblog.repos.BlogRepository;

import java.util.List;

@RestController
public class HomeController {

    private final BlogRepository blogRepository;
    @Autowired
    public HomeController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @GetMapping
    public List<Blog> getBlogs(){
        return blogRepository.findAll();
    }
    @PostMapping
    public void postBlogs(@RequestBody Blog blog){
        blogRepository.save(blog);
    }
}
