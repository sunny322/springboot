package com.virtusa.SpringBootCrud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.virtusa.SpringBootCrud.bean.Task;
import com.virtusa.SpringBootCrud.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/saveTask")
	public Task saveTask(@RequestBody Task task) {
		return taskService.saveTask(task);
	}
	
	@GetMapping("/getTasks")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}
	
	@GetMapping("/getTaskById/{id}")
	public Task getTaskById(@PathVariable String id) {
		return taskService.getTaskById(id);
	}
	
	@GetMapping("/getTaskByName/{name}")
	public Task getTaskByTaskHolderName(@PathVariable String taskHolderName) {
		return taskService.getTaskByTaskHolderName(taskHolderName);
	}
	
	@PutMapping("/updateStatus")
	public Task updateStatus(@RequestBody Task task) {
		return taskService.updateStatus(task);
	}
	
	@DeleteMapping("/deletTask/{id}")
	public void deleteTask(@PathVariable String id) {
		taskService.deleteTask(id);
	}
	
	
	
	
	
	
	
	
	
	
}
