package com.example.todolistapi.controllers.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.example.todolistapi.models.StatusTask;
import com.example.todolistapi.models.Task;

public class TaskDto {
  private String id;
  private String name;
  private LocalDateTime date;
  private StatusTask status;

  public TaskDto(Task task) {
    this.setId(task.getId());
    this.setName(task.getName());
    this.setDate(task.getDate());
    this.setStatus(task.getStatus());
  }

  public String getId() {
    return id;
  }

  public StatusTask getStatus() {
    return status;
  }

  public void setStatus(StatusTask status) {
    this.status = status;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(String id) {
    this.id = id;
  }

public static List<TaskDto> convert(List<Task> task) {
	return task.stream().map(TaskDto::new).collect(Collectors.toList());
}
}