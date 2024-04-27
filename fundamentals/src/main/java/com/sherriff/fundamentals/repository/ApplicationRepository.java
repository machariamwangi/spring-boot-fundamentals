package com.sherriff.fundamentals.repository;


import com.sherriff.fundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
