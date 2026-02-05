package com.meuapp.consolidador.repository;

import com.meuapp.consolidador.domain.entity.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Essa parte funciona basicamente como um molde de query sql */
@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    Long contByHashDuplicada(String hash);
}
