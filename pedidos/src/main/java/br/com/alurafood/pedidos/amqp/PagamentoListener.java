package br.com.alurafood.pedidos.amqp;

import br.com.alurafood.pedidos.dto.PagamentoDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoListener {

    @RabbitListener(queues = "pagamentos.detalhes-pedido")
    public void recebeMensagem(PagamentoDto pagamento) {
        String mensagem = """
                Dados do pagamento: %s
                Numero do pedido: %s
                Valor: %s
                Status: %s
                """.formatted(pagamento.getId(),
                pagamento.getPedidoId(),
                pagamento.getValor(),
                pagamento.getStatus());
        System.out.println("Recebi a mensagem " + mensagem);
    }
}