package com.enalto.springframework.repositories;

import com.enalto.springframework.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends
        JpaRepository<Beer, UUID>,
        PagingAndSortingRepository<Beer, UUID>,
        CrudRepository<Beer, UUID> {
}
