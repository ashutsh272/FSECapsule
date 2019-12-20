package com.fse.capsule.taskmanager.service;

import java.util.List;

import com.fse.capsule.taskmanager.entity.Task;

public interface TaskManagerService {

	List<Task> getAllTasks();

	List<Task> getTasksBasedOnTaskName(String taskName);

	List<Task> getTasksBasedOnParentTaskName(String parentTaskName);

	List<Task> getTasksBasedOnStartDate(String startDate);

	List<Task> getTasksBasedOnEndDate(String endDate);

	List<Task> getTasksBasedOnPriority(String priority);

	void deleteTask(String taskName);

	void saveTask(Task task);

	void updateTaskStatus(String taskName);

}
