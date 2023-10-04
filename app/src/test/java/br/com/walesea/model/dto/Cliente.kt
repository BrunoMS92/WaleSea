package br.com.walesea.model.dto

class Cliente {
    var id : Int = 0
    var nome : String? = null
    var telefone : String? = null
    var email : String? = null
    var senha : String? = null
    override fun toString(): String {
        return """
            ID: $id
            Nome: $nome
            Telefone: $telefone
            Email: $email
            Senha: $senha
            """.trimIndent()
    }


}