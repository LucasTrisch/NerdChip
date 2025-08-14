package comNerdChip.NerdChip.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table (name ="Pedidos") 
public class Pedido {
    @Id
    private long id;
    private int numero;
    private float preco;
    private String lista;
    private String pagamento;

    public Pedido(){}

    public Pedido(Log id,int numero,float preco,String lista,String pagamento){
    this.id = id;
    this.numero = numero;
    this.preco = preco;
    this.lista = lista;
    this.pagamento = pagamento;
}
}
