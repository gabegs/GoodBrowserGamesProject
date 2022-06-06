/**
 * Created by Dawid Stankiewicz on 18.07.2016
 */
package com.mackenzie.goodbrowsergames.post;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.goodbrowsergames.topic.Topic;
import com.mackenzie.goodbrowsergames.user.User;


public interface PostRepository extends JpaRepository<Post, Integer> {
    
    Set<Post> findByUser(User user);
    
    Set<Post> findByTopic(Topic topic);
    
    Set<Post> findAllByOrderByCreationDateDesc();
    
    Set<Post> findTop5ByOrderByCreationDateDesc();
}
