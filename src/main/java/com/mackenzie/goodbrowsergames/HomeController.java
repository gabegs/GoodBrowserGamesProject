/**
 * Created by Dawid Stankiewicz on 3 Jul 2016
 */
package com.mackenzie.goodbrowsergames;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mackenzie.goodbrowsergames.post.PostService;
import com.mackenzie.goodbrowsergames.section.SectionService;
import com.mackenzie.goodbrowsergames.topic.TopicService;


@Controller
public class HomeController {
    
    @Autowired
    private SectionService sectionService;
    
    @Autowired
    private TopicService topicService;
    
    @Autowired
    private PostService postService;
    
    @RequestMapping(value = { "/",
                              "/home" })
    public String home(Model model) {
        model.addAttribute("sections", sectionService.findAll());
        model.addAttribute("topics", topicService.findRecent());
        model.addAttribute("posts", postService.findRecent());
        return "home";
    }
    
}
