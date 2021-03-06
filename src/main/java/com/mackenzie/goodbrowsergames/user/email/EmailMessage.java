package com.mackenzie.goodbrowsergames.user.email;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmailMessage {

    private String recipient;
    private String subject;
    private String content;
}
