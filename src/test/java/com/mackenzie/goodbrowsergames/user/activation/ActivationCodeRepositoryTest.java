package com.mackenzie.goodbrowsergames.user.activation;

import static org.junit.Assert.assertNotNull;

import com.mackenzie.goodbrowsergames.IntegrationTestCase;
import com.mackenzie.goodbrowsergames.user.activation.ActivationCode;
import com.mackenzie.goodbrowsergames.user.activation.ActivationCodeRepository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ActivationCodeRepositoryTest extends IntegrationTestCase {

    @Autowired
    private ActivationCodeRepository repository;


    @Test
    public void testSaveShouldReturnEntity() {
        ActivationCode activationCode = new ActivationCode("XXX");
        activationCode = repository.save(activationCode);

        assertNotNull(activationCode);
    }
}
