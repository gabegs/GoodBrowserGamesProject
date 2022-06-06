/**
 * Created by Dawid Stankiewicz on 25.07.2016
 */
package com.mackenzie.goodbrowsergames.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;

import com.mackenzie.goodbrowsergames.IntegrationTestCase;


public class HomeControllerTest extends IntegrationTestCase {


    @Test
    public void testHomePageView() throws Exception {
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }

}
