package com.microservicios.posts_service.service;


import com.microservicios.posts_service.model.Post;

import java.util.List;

public interface IPostService {

    public List<Post> getPostsByUser(Long user_id);

}
