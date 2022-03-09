package com.exampe.webfluxelastic.controllers;

import com.exampe.webfluxelastic.dto.PostDto;
import com.exampe.webfluxelastic.models.Post;
import com.exampe.webfluxelastic.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("employees")
public class PostController {

    private final PostService postService;

    @PostMapping("")
    public ResponseEntity<Mono<Post>>create(@RequestBody PostDto postDto){
        return ResponseEntity.ok(postService.save(postDto));
    }

    @GetMapping("")
    public ResponseEntity<Flux<Post>>getAll(){
        return ResponseEntity.ok(postService.getAll());
    }

    @GetMapping("title/{title}")
    public ResponseEntity<Flux<Post>>getByTitle(@PathVariable("title")String title){
        return ResponseEntity.ok(postService.getByTitle(title));
    }

    @GetMapping("containing/{keyword}")
    public ResponseEntity<Flux<Post>>getByKeyWordContained(@PathVariable("keyword")String keyword){
        return ResponseEntity.ok(postService.getByContent(keyword));
    }
}
