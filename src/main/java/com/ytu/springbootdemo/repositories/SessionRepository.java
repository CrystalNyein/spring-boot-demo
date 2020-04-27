package com.ytu.springbootdemo.repositories;

import com.ytu.springbootdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
