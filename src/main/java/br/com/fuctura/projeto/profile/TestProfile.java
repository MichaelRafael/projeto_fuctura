package br.com.fuctura.projeto.profile;


import br.com.fuctura.projeto.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestProfile {

    @Autowired
    private DBService dbService;

    @Bean
    public void instanciaDB() {
       this.dbService.instaciaDB();
   }
}
