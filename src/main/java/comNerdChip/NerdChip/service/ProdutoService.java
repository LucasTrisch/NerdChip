package comNerdChip.NerdChip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import comNerdChip.NerdChip.models.Produto;
import comNerdChip.NerdChip.repositories.ProdutoRepository;

import java.util.List;
import java.util.ArrayList;

@Service
public class ProdutoService {
@Autowired
    ProdutoRepository produtoRepository;
    public List<Produto> listarTodos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    public Produto buscarPorId(Long id) {
        return produtos.stream()
                .filter(produto -> produto.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Produto salvar(Produto produto) {
        produtos.add(produto);
        return produto;
    }

    public void remover(Long id) {
        produtos.removeIf(produto -> produto.getId().equals(id));
    }
    
    
}
