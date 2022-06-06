package com.mackenzie.goodbrowsergames.user.email;

import com.mackenzie.goodbrowsergames.exception.ForumException;

public interface SenderService {

    void sendEmail(EmailMessage emailMessage) throws ForumException;

}
