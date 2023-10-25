package com.sevilay.phoneShowRoom.service;

import com.sevilay.phoneShowRoom.dto.request.SavePhoneRequestDto;
import com.sevilay.phoneShowRoom.dto.response.FindAllPhoneResponseDto;
import com.sevilay.phoneShowRoom.mapper.PhoneMapper;
import com.sevilay.phoneShowRoom.repository.PhoneRepository;
import com.sevilay.phoneShowRoom.repository.entity.Phone;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PhoneService {
    private final PhoneRepository repository;

    public void save(SavePhoneRequestDto dto) {

        Phone phone = PhoneMapper.INSTANE.phoneFromDto(dto);
        repository.save(phone);
    }

    public FindAllPhoneResponseDto findAll() {
        return FindAllPhoneResponseDto.builder()
                .statusCode(100)
                .message("Telefonlar başarılı bir şekilde getirildi")
                .data(repository.findAll())
                .build();
    }
}
