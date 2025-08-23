package comNerdChip.NerdChip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import comNerdChip.NerdChip.repositories.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    public ResponseEntity<List<PedidoDTO>> listarTodos(){

    }
    
}
