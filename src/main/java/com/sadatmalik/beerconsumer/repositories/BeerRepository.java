package com.sadatmalik.beerconsumer.repositories;

import com.sadatmalik.beerconsumer.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}