package com.exampe.webfluxelastic.services;

import com.exampe.webfluxelastic.dto.PostDto;
import com.exampe.webfluxelastic.models.Post;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PostService {

    Mono<Post>save(PostDto postDto);

    Flux<Post>getAll();

    Flux<Post>getByContent(String keyword);

    Flux<Post>getByTitle(String title);
}
