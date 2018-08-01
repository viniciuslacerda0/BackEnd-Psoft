package com.example.backend.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.backend.model.InteressadosDisciplina;

@Repository
@Transactional
public interface InteressadoDRepositorio extends JpaRepository<InteressadosDisciplina, String> {
	@Query("SELECT n_disciplina FROM InteressadosDisciplina i WHERE aluno_matricula = text")
	public List<InteressadosDisciplina> FindByMatricula(@Param("text") String text);

}