package io.github.felipetavaresmelo.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.felipetavaresmelo.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
