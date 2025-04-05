package microservicos.pedido.service;

import microservicos.pedido.model.ItemPedido;
import microservicos.pedido.model.Pedido;
import microservicos.pedido.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido salvarPedido(Pedido pedido) {
        if (pedido.getItens() !=null) {
            for (ItemPedido item: pedido.getItens()) {
                item.setPedido(pedido);

            }
        }
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
 }
