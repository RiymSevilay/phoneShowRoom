package com.sevilay.phoneShowRoom.repository;

import com.sevilay.phoneShowRoom.dto.request.SaveMarkaRequestDto;
import com.sevilay.phoneShowRoom.mapper.MarkaMapper;
import com.sevilay.phoneShowRoom.repository.entity.Marka;
import com.sevilay.phoneShowRoom.repository.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkaRepository extends JpaRepository<Marka, Long> {

}
