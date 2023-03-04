package com.example.cow.repository;

import com.example.cow.entity.Cow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CowRepository extends JpaRepository<Cow ,Long> {



}
