package com.sevilay.phoneShowRoom.exception;

import lombok.Getter;

@Getter
public class PhoneShowRoomException extends RuntimeException {

    private final ErrorType errorType;

    public PhoneShowRoomException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public PhoneShowRoomException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

}
