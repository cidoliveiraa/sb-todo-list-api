package com.example.todolistapi.controllers;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolistapi.controllers.dto.TaskDto;
import com.example.todolistapi.models.*;

@RestController
public class TaskController{

  @RequestMapping("/tasks")
  public List<TaskDto> List(){
    Task task = new Task("11111", "testzito papai", LocalDateTime.now(), StatusTask.PENDING);
    return TaskDto.convert(Arrays.asList(task, task, task));
    
  }
}