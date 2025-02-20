package br.com.alura.service;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.domain.Pet;
import org.junit.jupiter.api.Test;

import java.net.http.HttpResponse;

import static org.mockito.Mockito.mock;

public class PetServiceTest {
    private ClientHttpConfiguration client = mock(ClientHttpConfiguration.class);
    private HttpResponse httpResponse = mock(HttpResponse.class);
    private PetService petService = new PetService(client);
    private Pet pet = new Pet("Cachorro", "Bidu", "Salsicha", 7, "Marrom", 10.00F);

    @Test
    public void deveVerificarSeDispararRequisicaoGetSeraChamado (){

    }

}