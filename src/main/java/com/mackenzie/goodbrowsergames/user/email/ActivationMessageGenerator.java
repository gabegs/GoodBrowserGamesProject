package com.mackenzie.goodbrowsergames.user.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.TemplateEngine;

import com.mackenzie.goodbrowsergames.user.activation.ActivationCode;

public abstract class ActivationMessageGenerator {

    @Autowired
    protected TemplateEngine templateEngine;

    private final String SUBJECT = "forum: ative sua conta!";

    public EmailMessage generate(ActivationCode activationCode) {
        String emailAddress = activationCode.getUser().getEmail();
        String content = createMessageContent(activationCode);

        EmailMessage emailMessage = new EmailMessage(emailAddress, SUBJECT, content);
        return emailMessage;
    }

    public abstract String createMessageContent(ActivationCode activationCode);

}
