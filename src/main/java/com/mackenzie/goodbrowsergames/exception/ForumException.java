package com.mackenzie.goodbrowsergames.exception;

import lombok.Getter;

import static com.mackenzie.goodbrowsergames.exception.ForumException.ErrorCode.*;

import org.springframework.http.HttpStatus;

@Getter
public class ForumException extends RuntimeException {

    private ErrorCode errorCode = OK;

    private HttpStatus status = HttpStatus.OK;

    private String message;

    public ForumException() {
    }

    public ForumException(String message) {
        super(message);
    }

    public ForumException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.message = this.errorCode.message;
    }

    public enum ErrorCode {
        OK(1, "OK"),
        INVALID_GENDER(2, "Gênero inválido"),
        INVALID_USER_FORM(3, "Formulário inválido"),
        CLIENT_ERROR(4, "Erro de Client"),
        INTERNAL_ERROR(5, "Erro de servidor de internet"),
        SENDER_SERVICE_ERROR(6, "Erro no envio do email"),
        INVALID_ACTIVATION_REQUEST(7, "Requisição de ativação inválida");

        ErrorCode(int index, String message) {
            this.index = index;
            this.message = message;
        }

        public String message;
        public int index;
    }
}
