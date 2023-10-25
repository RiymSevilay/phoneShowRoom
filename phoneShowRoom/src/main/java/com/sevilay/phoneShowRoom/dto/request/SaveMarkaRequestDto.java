package com.sevilay.phoneShowRoom.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveMarkaRequestDto {
    @NotNull
    String markaAdi;

    @NotNull
    String modelAdi;
}
