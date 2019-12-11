package com.fse.capsule.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.fse.capsule.taskmanager.entity.Task;
import com.fse.capsule.taskmanager.service.TaskManagerService;

@RestController // Helps Spring know that this is a rest controller and hence
				// while scanning registers the mappings
public class TaskManagerController {

	@Autowired
	TaskManagerService taskManagerServiceImpl;

	@RequestMapping("taskmanager/hello")
	public String sayHello() {
		return "Hello from FSE Task Manager!!";
	}

	@RequestMapping("taskmanger/services")
	public String getAllServices() {
		return "FSE Task Manager Service URLs: <BR>" + "taskmanager/hello"
				+ "<a href=\"http://localhost:8080/taskmanager.html\">here</a><BR>" + "taskmanger/services"
				+ "taskmanger/task/view/all" + "taskmanger/task/view/{taskName}"
				+ "taskmanger/task/view/{parentTaskName}" + "taskmanger/task/view/{startDate}"
				+ "taskmanger/task/view/{endDate}" + "taskmanger/task/view/{priority}"
				+ "taskmanger/task/delete/{taskName}" + "taskmanger/task/save";
	}

	// View/all
	@RequestMapping("taskmanger/task/view/all")
	public List<Task> getAllTasks() {
		System.out.println("Request Received for getAllTasks");
		return taskManagerServiceImpl.getAllTasks();
	}

	// view/taskName
	@RequestMapping("taskmanger/task/view/name/{taskName}")
	public List<Task> getTasksBasedOnTaskName(@PathVariable String taskName) {
		System.out.println("Request Received for getTasksBasedOnTaskName: "+taskName);
		return taskManagerServiceImpl.getTasksBasedOnTaskName(taskName);
	}

	// View/parentTaskName
	@RequestMapping("taskmanger/task/view/parent/{parentTaskName}")
	public List<Task> getTasksBasedOnParentTaskName(@PathVariable String parentTaskName) {
		System.out.println("Request Received for getTasksBasedOnParentTaskName");
		return taskManagerServiceImpl.getTasksBasedOnParentTaskName(parentTaskName);
	}

	// View/startDate
	@RequestMapping("taskmanger/task/view/startDate/{startDate}")
	public List<Task> getTasksBasedOnStartDate(@PathVariable String startDate) {
		System.out.println("Request Received for getTasksBasedOnStartDate");
		return taskManagerServiceImpl.getTasksBasedOnStartDate(startDate);
	}

	// View/endDate
	@RequestMapping("taskmanger/task/view/endDate/{endDate}")
	public List<Task> getTasksBasedOnEndDate(@PathVariable String endDate) {
		System.out.println("Request Received for getTasksBasedOnEndDate");
		return taskManagerServiceImpl.getTasksBasedOnEndDate(endDate);
	}

	// view/priority
	@RequestMapping("taskmanger/task/view/priority/{priority}")
	public List<Task> getTasksBasedOnPriority(@PathVariable String priority) {
		System.out.println("Request Received for getTasksBasedOnPriority");
		return taskManagerServiceImpl.getTasksBasedOnPriority(priority);
	}

	// delete
	@RequestMapping("taskmanger/task/delete/{taskName}")
	public String deleteTaskBasedOnTaskName(@PathVariable String taskName) {
		System.out.println("Request Received for getTasksBasedOnPriority");
		taskManagerServiceImpl.deleteTask(taskName);
		return "Task Deleted";
	}

	// save
	@RequestMapping(method = RequestMethod.POST, value = "taskmanger/task/save")
	public String saveTask(@RequestBody Task task) {
		System.out.println("Request received for saveTask");
		taskManagerServiceImpl.saveTask(task);
		return "Task Saved";
	}

}
