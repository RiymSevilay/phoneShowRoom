package com.sevilay.phoneShowRoom.mapper;

import com.sevilay.phoneShowRoom.dto.request.SavePhoneRequestDto;
import com.sevilay.phoneShowRoom.repository.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhoneMapper {
    PhoneMapper INSTANE = Mappers.getMapper(PhoneMapper.class);

    Phone phoneFromDto(final SavePhoneRequestDto dto);
}
