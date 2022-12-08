package com.clamed.dto;

import lombok.Getter;
import lombok.Setter;

import javax.websocket.server.ServerEndpoint;

@Getter
@Setter
public class ContatoInput {

    private Long id;

    private String nome;

    private String telefoneFixo;

    private String telefoneCelular;

    private String telefoneTrabalho;

    private String email;

}