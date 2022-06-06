/**
 * Created by Dawid Stankiewicz on 29.07.2016
 */
package com.mackenzie.goodbrowsergames.exception;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

import com.mackenzie.goodbrowsergames.IntegrationTestCase;


public class ExceptionHandlerTest extends IntegrationTestCase {
    
    @Test
    public void notFoundErrorPage() throws Exception {
        mockMvc.perform(get("/fsasa4eraw4rffsref")).andExpect(status().isNotFound());
    }
}
