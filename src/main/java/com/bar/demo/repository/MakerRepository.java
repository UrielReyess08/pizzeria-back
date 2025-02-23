package com.bar.demo.repository;

import com.bar.demo.entity.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository  extends CrudRepository<Maker, Long> {
}
