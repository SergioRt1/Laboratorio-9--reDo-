package com.example.Lab92.beans;

import com.example.Lab92.model.Message;
import com.example.Lab92.services.MessageException;

import java.util.List;

/**
 *
 * @author sergio
 * Se encarga de realizar la coneccion con los api externos.
 */
public interface HttpConnection {

    /**
     * Obtiene los datos del clima de una ciudad desde un api externo.
     * @return Lista de los ultimos 10 mensajes
     * @throws MessageException
     */
    String getMessages() throws MessageException;

}