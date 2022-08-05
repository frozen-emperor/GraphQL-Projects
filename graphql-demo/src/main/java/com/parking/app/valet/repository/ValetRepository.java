package com.parking.app.valet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ValetRepository extends JpaRepository<ValetEntity, UUID> {
}
