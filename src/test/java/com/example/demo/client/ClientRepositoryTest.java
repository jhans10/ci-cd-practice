package com.example.demo.client;

import com.example.demo.client.model.Client;
import com.example.demo.client.repository.ClientRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

//@DataJpaTest
public class ClientRepositoryTest {

/*
    @Autowired
    ClientRepository clientRepository;

    @AfterEach
    void tearDown(){
        clientRepository.deleteAll();
    }



    @Test
    void ExistsClient(){
        //given
        Client client = Client.builder().id(1L).age(28).name("jhans").lastName("timaná").build();

        //when
        Client clientSave = clientRepository.save(client);


        //then
        Assertions.assertThat(clientSave).isEqualTo(client);

    }

    @Test
    void ExistsId(){
        //given
        Long id = 1L;

        //when
        Client clientSave = clientRepository.findById(id).orElse(null);


        //then
        Assertions.assertThat(clientSave).isNull();

    }





 */

}
