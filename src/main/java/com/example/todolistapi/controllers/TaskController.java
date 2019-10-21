package com.example.todolistapi.controllers;

import com.example.todolistapi.models.Task;
import com.example.todolistapi.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

  @Autowired
  TaskRepository taskRepository;

  @RequestMapping(method = RequestMethod.POST, value = "/tasks")
  public String create(@RequestBody Task task) {
    taskRepository.save(task);
    return task.getId();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/tasks")
  public Iterable<Task> list() {
    return taskRepository.findAll();
  }
}