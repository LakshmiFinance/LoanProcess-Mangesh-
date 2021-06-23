package com.cjc.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.demo.model.generalclasses.CibilScore;

@Repository
public interface CibilRepository extends CrudRepository<CibilScore, Integer>
{

}
