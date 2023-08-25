package com.rt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rt.dao.HomeDao;
import com.rt.entity.HomeEntity;

@Component
public class HomeService {

	@Autowired
	HomeDao dao;

	public void addData(HomeEntity e) {

		dao.save(e);

	}

	public HomeEntity deleteById(int id) {
		dao.deleteById(id);
		return null;
	}

	public Optional<HomeEntity> findById(int id) {
		Optional<HomeEntity> e = dao.findById(id);
		return e;

	}

	public List<HomeEntity> findByName(String name) {
		List<HomeEntity> e = dao.findByName(name);
		return e;

	}

	public List<HomeEntity> findAll() {
		List<HomeEntity> e = dao.findAll();
		return e;
	}

}
