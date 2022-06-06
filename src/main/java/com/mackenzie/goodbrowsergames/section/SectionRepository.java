/**
 * Created by Dawid Stankiewicz on 17.07.2016
 */
package com.mackenzie.goodbrowsergames.section;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mackenzie.goodbrowsergames.section.Section;


public interface SectionRepository extends JpaRepository<Section, Integer> {
    
    Section findByName(String name);
    
}
