/**
 * Created by Dawid Stankiewicz on 04.08.2016
 */
package com.mackenzie.goodbrowsergames.user;


public interface UserProfileService {
    
    public UserProfile findOne(int userId);
    
    public UserProfile findOne(String username);
    
}
