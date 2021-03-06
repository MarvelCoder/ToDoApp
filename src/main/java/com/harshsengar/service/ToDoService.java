package com.harshsengar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshsengar.data.ToDo;
import com.harshsengar.exception.EntityNotFoundException;
import com.harshsengar.repository.ToDoRepository;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository toDoRepository;

	public List<ToDo> findAll() {
		return toDoRepository.findAll();
	}

	public ToDo findById(String id) {
		return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}

	public ToDo save(ToDo toDo) {
		return toDoRepository.save(toDo);
	}

	public void deleteByID(String id) {
		toDoRepository.deleteById(id);
	}
}
