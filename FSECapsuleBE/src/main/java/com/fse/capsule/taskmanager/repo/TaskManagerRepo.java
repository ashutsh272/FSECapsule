package com.fse.capsule.taskmanager.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fse.capsule.taskmanager.entity.Task;

public interface TaskManagerRepo extends CrudRepository<Task, String> {

	List<Task> findByTaskName(String taskName);

	List<Task> findByParentTaskName(String parentTaskName);
	
	List<Task> findByStartDate(String startDate);
	
	List<Task> findByEndDate(String endDate);
	
	List<Task> findByPriority(String priority);
	
	List<Task> findByStatus(String priority);

	
}
