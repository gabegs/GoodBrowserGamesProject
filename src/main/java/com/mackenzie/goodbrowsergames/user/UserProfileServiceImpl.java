/**
 * Created by Dawid Stankiewicz on 04.08.2016
 */
package com.mackenzie.goodbrowsergames.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mackenzie.goodbrowsergames.post.PostService;
import com.mackenzie.goodbrowsergames.topic.TopicService;
import com.mackenzie.goodbrowsergames.user.User;
import com.mackenzie.goodbrowsergames.user.UserProfile;
import com.mackenzie.goodbrowsergames.user.UserProfileService;
import com.mackenzie.goodbrowsergames.user.UserService;


@Service
public class UserProfileServiceImpl implements UserProfileService {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private PostService postService;
    
    @Autowired
    private TopicService topicService;
    
    @Override
    public UserProfile findOne(int userId) {
        UserProfile userProfile = new UserProfile();
        User user = userService.findOne(userId);
        userProfile.setUser(user);
        userProfile.setPosts(postService.findByUser(user));
        userProfile.setTopics(topicService.findByUser(user));
        return userProfile;
    }
    
    @Override
    public UserProfile findOne(String username) {
        return findOne(userService.findByUsername(username).getId());
    }
    
}
