package br.com.comunicador.application.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
@Setter
public class Comunicacao {

    private Long id;
    private LocalDateTime dataAgendamento;
    private TipoComunicacao tipoComunicacao;

    private String destinatario; //todo: verificar se muda para outra classe

    private String mensagem;

    @Override
    public String toString() {//todo: remover dps
        return "Comunicacao{" +
                "id=" + id +
                ", dataAgendamento=" + dataAgendamento +
                ", tipoComunicacao=" + tipoComunicacao +
                ", destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}
