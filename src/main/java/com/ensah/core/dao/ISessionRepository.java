package com.ensah.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensah.core.bo.Session;

public interface ISessionRepository extends JpaRepository<Session,Long> {

}
