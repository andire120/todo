package com.example.todo.service

import com.example.todo.model.http.TodoDto
import com.example.todo.repositor.TodoRepositoryImpl
import org.springframework.stereotype.Service

@Service
class TodoService(
    val todoRepositoryImpl: TodoRepositoryImpl
) {

    // C
    fun create(todoDto: TodoDto) {

    }
    // R

    // U

    // D

}