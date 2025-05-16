package com.reservas.sistema.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class UsuarioProducer {

    private final RabbitTemplate rabbitTemplate;

    public UsuarioProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarMensaje(String mensaje) {
        rabbitTemplate.convertAndSend("colaReservas", mensaje);
    }
}
