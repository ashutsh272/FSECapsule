package com.fse.capsule.taskmanager.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fse.capsule.taskmanager.entity.Task;

public interface TaskManagerRepo extends CrudRepository<Task, String> {

	List<Task> findByTaskKeyTaskName(String taskName);

	
}
