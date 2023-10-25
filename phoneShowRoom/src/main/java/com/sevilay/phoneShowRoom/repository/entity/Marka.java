package com.sevilay.phoneShowRoom.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_marka")
public class Marka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String markaAdi;
    String modelAdi;


}
