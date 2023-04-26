package br.com.fuctura.projeto.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.intellij.lang.annotations.Pattern;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardError {

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime timesTemp;
    private Integer status;
    private String error;
}
