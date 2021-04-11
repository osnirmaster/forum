package br.com.lab.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lab.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
