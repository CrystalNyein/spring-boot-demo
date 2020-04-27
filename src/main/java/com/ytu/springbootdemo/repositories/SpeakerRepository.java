package com.ytu.springbootdemo.repositories;

import com.ytu.springbootdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
