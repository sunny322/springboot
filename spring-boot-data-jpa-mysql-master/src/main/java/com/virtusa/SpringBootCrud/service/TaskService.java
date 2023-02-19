package com.virtusa.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.virtusa.SpringBootCrud.bean.Task;
import com.virtusa.SpringBootCrud.repository.TaskRepository;


@Service
public class TaskService {
	@Autowired
	public TaskRepository taskRepo;

//	public List<Task> getAllTasks()
//	{
//		List<Task> tasks = new ArrayList<>();
//		taskRepo.findAll().forEach(tasks::add);
//		return tasks;
//	}

	public void addTask(Task task) {
		taskRepo.save(task);
		
	}

	public Task updateStatus(Task task) {
		Task existingTask=taskRepo.findById(task.getTaskId()).orElse(null);
		existingTask.setTaskStatus(task.getTaskStatus());
		return taskRepo.save(existingTask);
		
	}

	public void deleteTask(String id) {
		taskRepo.deleteById(id);
		
	}
	public Task getTaskById(String id) {
		return taskRepo.findById(id).orElse(null);
	}
	public Task saveTask(Task task) {
		return taskRepo.save(task);
	}
	public List<Task> getAllTasks(){
		return taskRepo.findAll();
	}
	public Task getTaskByTaskHolderName(String name){
		return taskRepo.findByTaskHolderName(name);
	}
}
