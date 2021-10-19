
package trabalho;

import java.util.Objects;


public class Produto {
    private String seialnum;
    private int quantidade;
   private String nome;
   private double preco;
  
    public Produto(String seialnum, int quantidade, String nome, double preco) {
        this.seialnum = seialnum;
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return   "Número: " + seialnum + ", Quantidade: " + quantidade + ", Nome: " + nome + ", Preço: " + preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.seialnum);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.seialnum, other.seialnum)) {
            return false;
        }
        return true;
    }

   

    public String getSeialnum() {
        return seialnum;
    }

    public void setSeialnum(String seialnum) {
        this.seialnum = seialnum;
    }
 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
