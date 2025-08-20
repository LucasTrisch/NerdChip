package comNerdChip.NerdChip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import comNerdChip.NerdChip.dtos.ProdutoDTO;
import comNerdChip.NerdChip.repositories.ProdutoRepository;


@Service
public class ProdutoService  {
    @Autowired
    private ProdutoRepository produtoRepository;
    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> listarTodos() {
        return listarTodos(); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> buscarPorId(@PathVariable Long id) {
        return buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> criar(@Validated @RequestBody ProdutoDTO produtoDTO) {
        ProdutoDTO novoProduto = produtoRepository.criar(produtoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoDTO> atualizar(@PathVariable Long id, @Validated @RequestBody ProdutoDTO produtoDTO) {
        ProdutoDTO produtoAtualizado = produtoRepository.atualizar(id, produtoDTO);
        return ResponseEntity.ok(produtoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}