package com.example.todayError.repository;

import com.example.todayError.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post , Long> {
<<<<<<< HEAD
    List<Post> findByCategory(String category);
=======

    List<Post> findByCategory(String category);

>>>>>>> 48eae21d099f842fbd1ad4af8c1a8d0f6b4da642
}
