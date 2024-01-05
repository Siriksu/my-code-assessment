package com.code.assessment.repository;

import java.util.List;
import java.util.Set;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.assessment.entity.Sport;

@Repository
public interface SportRepository  extends CrudRepository<Sport, Long> {

	List<Sport> findAllByNameIn(Set<String> names);
}
