package com.sevilay.phoneShowRoom.service;

import com.sevilay.phoneShowRoom.dto.request.SaveMarkaRequestDto;
import com.sevilay.phoneShowRoom.dto.response.FindAllMarkaResponseDto;
import com.sevilay.phoneShowRoom.dto.response.FindAllPhoneResponseDto;
import com.sevilay.phoneShowRoom.mapper.MarkaMapper;
import com.sevilay.phoneShowRoom.repository.MarkaRepository;
import com.sevilay.phoneShowRoom.repository.entity.Marka;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkaService {

    private final MarkaRepository repository;

    public void save(SaveMarkaRequestDto dto) {
        Marka marka = MarkaMapper.INSTANCE.markaFromDto(dto);
        repository.save(marka);
    }

    public FindAllMarkaResponseDto findAll() {
        return FindAllMarkaResponseDto.builder()
                .statusCode(100)
                .message("Markalar başarıyla getirildi")
                .data(repository.findAll())
                .build();
    }
}
