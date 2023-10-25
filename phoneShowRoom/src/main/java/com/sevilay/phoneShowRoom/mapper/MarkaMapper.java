package com.sevilay.phoneShowRoom.mapper;

import com.sevilay.phoneShowRoom.dto.request.SaveMarkaRequestDto;
import com.sevilay.phoneShowRoom.repository.entity.Marka;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MarkaMapper {

    MarkaMapper INSTANCE = Mappers.getMapper(MarkaMapper.class);

    Marka markaFromDto(final SaveMarkaRequestDto dto);

}
