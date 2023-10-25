package com.sevilay.phoneShowRoom.repository;

import com.sevilay.phoneShowRoom.repository.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
