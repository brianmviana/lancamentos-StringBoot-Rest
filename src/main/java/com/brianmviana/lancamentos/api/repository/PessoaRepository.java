package com.brianmviana.lancamentos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brianmviana.lancamentos.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}