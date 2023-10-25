package com.sevilay.phoneShowRoom.dto.response;

import com.sevilay.phoneShowRoom.repository.entity.Marka;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindAllMarkaResponseDto {
    int statusCode;
    String message;
    List<Marka> data;

}
