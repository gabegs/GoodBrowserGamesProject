/**
 * Created by Dawid Stankiewicz on 06.08.2016
 */
package com.mackenzie.goodbrowsergames.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Senha incorreta!")
public class IncorrectPasswordException extends RuntimeException {
    
    private static final long serialVersionUID = -5692096819031290349L;
    
}
