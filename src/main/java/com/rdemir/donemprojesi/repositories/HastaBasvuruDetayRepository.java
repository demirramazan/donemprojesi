package com.rdemir.donemprojesi.repositories;

import com.rdemir.donemprojesi.entities.HastaBasvuruDetay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HastaBasvuruDetayRepository extends JpaRepository<HastaBasvuruDetay, Long> {
}
