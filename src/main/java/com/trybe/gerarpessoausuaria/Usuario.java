package com.trybe.gerarpessoausuaria;

/**
 * Subclass.
 *
 */
public class Usuario extends Pessoa {

  public Usuario(String nome, String sobrenome) {
    super(nome, sobrenome);
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   *
   */
  public String getUsuario() {
    return (super.nome != null && super.sobrenome != null && super.nome.length() > 0
        && super.sobrenome.length() > 0) ? super.nome + '.' + super.sobrenome : "Usuário inválido";
  }
}
