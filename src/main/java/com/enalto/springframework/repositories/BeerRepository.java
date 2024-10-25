package com.enalto.springframework.repositories;

import com.enalto.springframework.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerRepository extends PagingAndSortingRepository<Beer, Long> {
}
