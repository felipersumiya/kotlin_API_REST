package br.com.felipersumiya.api_rest_kotlin.demo.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
class Contato(

    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,

    @field:NotNull
    @field:Size (min= 10, max = 50)
    var nome:String,

    @field:NotNull
    @field:Email
    var email:String
) {

}