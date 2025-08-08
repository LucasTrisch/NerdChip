package comNerdChip.NerdChip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comNerdChip.NerdChip.dtos.ProdutoDTO;
import comNerdChip.NerdChip.models.Produto;
import comNerdChip.NerdChip.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/produto")//localhost:8080/produto/1
public class ProdutoController {
    @Autowired
 private ProdutoService produtoService;
 
 @GetMapping("path")
 public String getMethodName(@RequestParam String param) {
     return new String();
 }
 public ResponseEntity<List<ProdutoDTO>> listarTodos() {
        List<ProdutoDTO> produtos = produtoService.listarTodos();
        return ResponseEntity.ok(produtos);
    }
     @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> buscarPorId(@PathVariable Long id) {
        ProdutoDTO produto = ProdutoService.java.buscarPorId(id);
        return ResponseEntity.ok(produto);
    }
    @PostMapping("")
     public ResponseEntity<ProdutoDTO> criar(@RequestBody Produto produto) {
        ProdutoDTO novoProduto = produtoService.criar(produto);
        return ResponseEntity.ok(novoProduto);
    }
    @PutMapping("/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }
    
}
