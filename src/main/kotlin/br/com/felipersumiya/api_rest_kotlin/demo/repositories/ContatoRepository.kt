package br.com.felipersumiya.api_rest_kotlin.demo.repositories

import br.com.felipersumiya.api_rest_kotlin.demo.entities.Contato
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContatoRepository : JpaRepository<Contato,Long> {


}