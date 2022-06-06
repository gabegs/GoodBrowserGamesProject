/**
 * Created by Dawid Stankiewicz on 29.07.2016
 */
package com.mackenzie.goodbrowsergames.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Usuário não existe!")
public class UserNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = -1588022872179092062L;
}
