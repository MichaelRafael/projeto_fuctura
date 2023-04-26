package br.com.fuctura.projeto.exceptions;

public class DataIntregretyViolationException extends RuntimeException{

    public DataIntregretyViolationException(String message) {
        super(message);
    }
}
