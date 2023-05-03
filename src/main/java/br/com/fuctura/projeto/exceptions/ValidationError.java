package br.com.fuctura.projeto.exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {


    private List<FieldMessage> erros = new ArrayList<>();


    public ValidationError() {
       super();
    }

    public ValidationError(LocalDateTime timesTemp, Integer status, String error) {

        super(timesTemp, status, error);

    }

    public List<FieldMessage> getErros() {
        return erros;
    }

    public void addError(String fieldName, String message) {
        this.erros.add(new FieldMessage(fieldName, message));
    }
}
