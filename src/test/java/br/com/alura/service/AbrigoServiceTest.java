package br.com.alura.service;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.domain.Abrigo;
import org.junit.jupiter.api.Test;

import java.net.http.HttpResponse;

import static org.mockito.Mockito.mock;

public class AbrigoServiceTest {
    private ClientHttpConfiguration client = mock(ClientHttpConfiguration.class);
    private HttpResponse httpResponse = mock(HttpResponse.class);
    private AbrigoService abrigoService = new AbrigoService(client);
    private Abrigo abrigo = new Abrigo("Teste", "116654646", "abrigo@test.com");

    @Test
    public void deveVerificarSeDispararRequisicaoGetSeraChamado (){

    }

}