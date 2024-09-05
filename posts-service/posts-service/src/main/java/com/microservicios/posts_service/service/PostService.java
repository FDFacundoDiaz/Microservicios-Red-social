package com.microservicios.posts_service.service;

import com.microservicios.posts_service.model.Post;
import com.microservicios.posts_service.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {

    @Autowired
    public IPostRepository postRepo;


    @Override
    public List<Post> getPostsByUser(Long user_id) {
        return postRepo.findPostByUserId(user_id);
    }
}
