package com.project.consorcio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.consorcio.entity.TipoBien;
import com.project.consorcio.repository.TipoBienRepository;

@Service
public class TipoBienService {
	@Autowired
	private TipoBienRepository repo;
	
	public List<TipoBien> listarTodos(){
		return repo.findAll();
	}

}
