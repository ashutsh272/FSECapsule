package com.fse.capsule.taskmanager.service;

import java.util.List;

import com.fse.capsule.taskmanager.entity.Task;

public interface TaskManagerService {

	List<Task> getAllTasks();

	List<Task> getTasksBasedOnTaskName();

	List<Task> getTasksBasedOnParentTaskName();

	List<Task> getTasksBasedOnStartDate();

	List<Task> getTasksBasedOnEndDate();

	List<Task> getTasksBasedOnPriority();

	void deleteTask(Task task);

	void saveTask(Task task);

}
