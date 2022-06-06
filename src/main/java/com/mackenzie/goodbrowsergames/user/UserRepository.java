/**
 * Created by Dawid Stankiewicz on 3 Jul 2016
 */
package com.mackenzie.goodbrowsergames.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.goodbrowsergames.user.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    
    User findByUsername(String username);
    
    User findByEmail(String email);
    
}
