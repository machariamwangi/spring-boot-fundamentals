package com.sherriff.fundamentals.repository;

import com.sherriff.fundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
