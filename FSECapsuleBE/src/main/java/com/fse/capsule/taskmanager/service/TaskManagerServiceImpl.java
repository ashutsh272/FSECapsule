package com.fse.capsule.taskmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.capsule.taskmanager.entity.Task;
import com.fse.capsule.taskmanager.repo.TaskManagerRepo;

@Service
public class TaskManagerServiceImpl implements TaskManagerService {

	@Autowired
	private TaskManagerRepo taskManagerRepo;

	@Override
	public List<Task> getAllTasks() {
		List<Task> resultList = new ArrayList<Task>();
		taskManagerRepo.findAll().forEach(t -> resultList.add(t));
		return resultList;
	}

	@Override
	public List<Task> getTasksBasedOnTaskName(String taskName) {
		System.out.println("Entry getTasksBasedOnTaskName: "+taskName);
		List<Task> resultList = new ArrayList<Task>();
		taskManagerRepo.findByTaskName(taskName).forEach(t -> resultList.add(t));
		return resultList;
	}

	@Override
	public List<Task> getTasksBasedOnParentTaskName(String parentTaskName) {
		List<Task> resultList = new ArrayList<Task>();
		taskManagerRepo.findByParentTaskName(parentTaskName).forEach(t -> resultList.add(t));
		return resultList;
	}

	@Override
	public List<Task> getTasksBasedOnStartDate(String startDate) {
		List<Task> resultList = new ArrayList<Task>();
		taskManagerRepo.findByStartDate(startDate).forEach(t -> resultList.add(t));
		return resultList;
	}

	@Override
	public List<Task> getTasksBasedOnEndDate(String endDate) {
		List<Task> resultList = new ArrayList<Task>();
		taskManagerRepo.findByEndDate(endDate).forEach(t -> resultList.add(t));
		return resultList;
	}

	@Override
	public List<Task> getTasksBasedOnPriority(String priority) {
		List<Task> resultList = new ArrayList<Task>();
		taskManagerRepo.findByPriority(priority).forEach(t -> resultList.add(t));
		return resultList;
	}

	@Override
	public void deleteTask(String taskName) {
		taskManagerRepo.delete(taskName);

	}

	@Override
	public void saveTask(Task task) {
		System.out.println("Entry saveTask: "+task+ " " +task.getTaskName());
		taskManagerRepo.save(task);

	}

	@Override
	public void updateTaskStatus(String taskName) {
		// TODO Auto-generated method stub
		
	}

}
