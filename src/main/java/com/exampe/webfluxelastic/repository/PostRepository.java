package com.exampe.webfluxelastic.repository;

import com.exampe.webfluxelastic.models.Post;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface PostRepository extends ReactiveCrudRepository<Post, String> {

    Flux<Post>findAllByTitle(String title);

    Flux<Post> findAllByContentContaining(String keyword);

    Flux<Post>findTopByContentContains(String keyword);

    Flux<Post>findAllByViewsAndRating(Integer views, Double rating);

    Flux<Post>findAllByViewsGreaterThan(Integer views);


}
