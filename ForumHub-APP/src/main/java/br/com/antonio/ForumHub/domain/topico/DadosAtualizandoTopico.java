package br.com.antonio.ForumHub.domain.topico;

import br.com.antonio.ForumHub.domain.autor.Autor;
import br.com.antonio.ForumHub.domain.curso.Curso;

import java.time.LocalDateTime;

public record DadosAtualizandoTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime dataDeCriacao ,
        EstadoDoTopico estadoDoTopico,
        Autor autor,
        Curso curso
        ) {
}
