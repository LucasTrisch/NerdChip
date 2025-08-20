package comNerdChip.NerdChip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comNerdChip.NerdChip.dtos.ProdutoDTO;
import comNerdChip.NerdChip.models.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Object listarTodos();

    Object buscarPorId(Long id);

    ProdutoDTO atualizar(Long id, ProdutoDTO produtoDTO);

    ProdutoDTO criar(ProdutoDTO produtoDTO);
}
