/**
 * Created by Dawid Stankiewicz on 18.07.2016
 */
package com.mackenzie.goodbrowsergames.topic;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.goodbrowsergames.section.Section;
import com.mackenzie.goodbrowsergames.user.User;


public interface TopicRepository extends JpaRepository<Topic, Integer> {
    
    Set<Topic> findBySection(Section section);
    
    Set<Topic> findByUser(User user);
    
    Set<Topic> findAllByOrderByCreationDateDesc();
    
    Set<Topic> findTop5ByOrderByCreationDateDesc();
    
    
}
