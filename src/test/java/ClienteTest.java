import org.example.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Cliente cliente = new Cliente( "Cliente Original","cliente1@email.com", new Endereco("Rua A", "Bairro A", 1));

        Cliente clienteClone = cliente.clone();
        clienteClone.setEmail("cliente2@email.com");
        clienteClone.setNome("Cliente Clonado");
        clienteClone.getEndereco().setNumero(2);

        assertEquals("Cliente{nome='Cliente Original', email='cliente1@email.com', endereco=Endereco{logradouro='Rua A', bairro='Bairro A', numero=1}}", cliente.toString());
        assertEquals("Cliente{nome='Cliente Clonado', email='cliente2@email.com', endereco=Endereco{logradouro='Rua A', bairro='Bairro A', numero=2}}", clienteClone.toString());
    }
}
