package com.virtusa.SpringBootCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.JPARepository;

import com.virtusa.SpringBootCrud.bean.Task;

public interface TaskRepository extends JpaRepository<Task,String> {

	Task findByTaskHolderName(String name);
	

}
