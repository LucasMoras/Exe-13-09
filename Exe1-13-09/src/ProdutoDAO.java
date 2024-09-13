
import javax.swing.JOptionPane;

public class ProdutoDAO { 
    public void MostrarProduto(ProdutoDTO objDTO){ 
        
        JOptionPane.showMessageDialog(null,objDTO.getNome() + "\n" + objDTO.getPreco() + "\n" + objDTO.getQuantidade());   
    }       
}
