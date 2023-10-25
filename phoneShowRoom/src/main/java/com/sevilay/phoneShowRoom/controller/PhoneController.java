package com.sevilay.phoneShowRoom.controller;

import com.sevilay.phoneShowRoom.dto.request.SavePhoneRequestDto;
import com.sevilay.phoneShowRoom.dto.response.FindAllPhoneResponseDto;
import com.sevilay.phoneShowRoom.service.PhoneService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.sevilay.phoneShowRoom.constants.RestApi.*;
@RestController
@RequestMapping(PHONE)
@RequiredArgsConstructor
public class PhoneController {
    private final PhoneService phoneService;
@PostMapping(SAVE)
    public ResponseEntity<Void> savePhone(@RequestBody @Valid SavePhoneRequestDto dto) {
        phoneService.save(dto);
        return ResponseEntity.ok().build();

    }
@GetMapping(FINDALL)
    public ResponseEntity<FindAllPhoneResponseDto> findAll(){
    return ResponseEntity.ok(phoneService.findAll());
    }

}
