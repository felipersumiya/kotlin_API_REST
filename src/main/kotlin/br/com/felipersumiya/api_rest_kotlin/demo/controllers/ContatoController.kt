package br.com.felipersumiya.api_rest_kotlin.demo.controllers

import br.com.felipersumiya.api_rest_kotlin.demo.entities.Contato
import br.com.felipersumiya.api_rest_kotlin.demo.repositories.ContatoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.persistence.EntityNotFoundException

@RestController
@RequestMapping("/contatos")
class ContatoController {

    @Autowired
    lateinit var repository: ContatoRepository


    @GetMapping
    fun index() :List<Contato>{

        return repository.findAll()

    }

    @PostMapping
    fun create(@RequestBody contato :Contato) :Contato{

       return repository.save(contato)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable (value="id") id:Long, @RequestBody novoContato:Contato) :Contato{
        val contato = repository.findById(id).orElseThrow { EntityNotFoundException() }

        contato.apply {
            this.nome = novoContato.nome
            this.email = novoContato.email
        }

        return repository.save(contato)

    }
}