package com.example.magazine.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.magazine.entity.Scaffale;

public interface ScaffaleRepository extends CrudRepository<Scaffale,Long> {

	public List <Scaffale> findAll();
}
