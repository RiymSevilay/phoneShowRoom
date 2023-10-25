package com.sevilay.phoneShowRoom.controller;

import com.sevilay.phoneShowRoom.dto.request.SaveMarkaRequestDto;
import com.sevilay.phoneShowRoom.dto.response.FindAllMarkaResponseDto;
import com.sevilay.phoneShowRoom.service.MarkaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.sevilay.phoneShowRoom.constants.RestApi.*;

@RestController
@RequestMapping(MARKA)
@RequiredArgsConstructor
public class MarkaController {

    private final MarkaService markaService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> saveMarka(@RequestBody @Valid SaveMarkaRequestDto dto) {
        markaService.save(dto);
        return ResponseEntity.ok().build();
    }
@GetMapping(FINDALL)
    public ResponseEntity<FindAllMarkaResponseDto> findAll() {
        return ResponseEntity.ok(markaService.findAll());
    }

}
