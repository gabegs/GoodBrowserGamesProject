/**
 * Created by Dawid Stankiewicz on 17.07.2016
 */
package com.mackenzie.goodbrowsergames.topic;

import java.util.List;
import java.util.Set;

import com.mackenzie.goodbrowsergames.section.Section;
import com.mackenzie.goodbrowsergames.user.User;


public interface TopicService {
    
    List<Topic> findAll();
    
    Topic findOne(int id);
    
    Set<Topic> findRecent();
    
    Set<Topic> findAllByOrderByCreationDateDesc();
    
    Set<Topic> findBySection(Section section);
    
    Set<Topic> findBySection(String sectionName);
    
    Topic save(Topic topic);
    
    Set<Topic> findBySection(int id);
    
    Set<Topic> findByUser(User user);
    
    void delete(int id);
    
    void delete(Topic topic);
    
}
