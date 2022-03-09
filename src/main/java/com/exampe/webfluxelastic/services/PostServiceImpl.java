package com.exampe.webfluxelastic.services;


import com.exampe.webfluxelastic.dto.PostDto;
import com.exampe.webfluxelastic.models.Post;
import com.exampe.webfluxelastic.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public Mono<Post> save(PostDto postDto) {
        Post post=new Post();
        post.setContent(postDto.getContent());
        post.setRating(postDto.getRating());
        post.setTitle(postDto.getTitle());
        post.setViews(postDto.getViews());
        post.setDate(new Date());
        return postRepository.save(post);
    }

    @Override
    public Flux<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    public Flux<Post> getByContent(String keyword) {
        return postRepository.findAllByContentContaining(keyword);
    }

    @Override
    public Flux<Post> getByTitle(String title) {
        return postRepository.findAllByTitle(title);
    }
}
