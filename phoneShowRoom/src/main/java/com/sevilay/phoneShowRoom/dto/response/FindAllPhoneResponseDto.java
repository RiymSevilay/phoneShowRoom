package com.sevilay.phoneShowRoom.dto.response;

import com.sevilay.phoneShowRoom.repository.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindAllPhoneResponseDto {

    int statusCode;
    String message;
    List<Phone> data;
}
