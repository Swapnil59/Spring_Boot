package com.rt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rt.entity.HomeEntity;

public interface HomeDao extends JpaRepository<HomeEntity, Integer> {

	List<HomeEntity> findByName(String name);

}
