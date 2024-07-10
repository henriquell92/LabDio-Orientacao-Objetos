package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidade.Cliente;

import java.util.Optional;


public class ClienteNegocio {

    
    private Banco bancoDados;

 
    public ClienteNegocio(Banco banco) {
        this.bancoDados = banco;
    }

   
    public Optional<Cliente> consultar(String cpf) {

        if (bancoDados.getCliente().getCpf().equals(cpf)) {
            return Optional.of(bancoDados.getCliente());
        } else {
            return Optional.empty();
        }
    }

    /**
     * Cadastra um novo cliente.
     * @param cliente Novo cliente que terá acesso a aplicação
     */
    //TODO Fazer a inclusão de cliente

    /**
     * Exclui um cliente específico.
     * @param cpf CPF do cliente
     */
    //TODO Fazer a exclusão de cliente

}
