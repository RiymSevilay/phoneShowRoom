package com.sevilay.phoneShowRoom.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    SIFRE_UYUSMUYOR(1001, "Girilen şifreler uyuşmuyor", HttpStatus.BAD_REQUEST),
    BAD_REQUEST_ERROR(3001, "Girilen bilgiler hatalı, kontrol ederek tekrar giriniz", HttpStatus.BAD_REQUEST),
    TUR_ERROR(1002, "Telefon modeli bulunamadı", HttpStatus.BAD_REQUEST);

    private int code;
    private String message;
    private HttpStatus httpStatus;

}
