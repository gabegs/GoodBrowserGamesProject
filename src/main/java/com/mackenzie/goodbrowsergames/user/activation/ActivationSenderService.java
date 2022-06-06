package com.mackenzie.goodbrowsergames.user.activation;

import com.mackenzie.goodbrowsergames.user.User;

public interface ActivationSenderService {

    void sendActivationCode(User user);

}
