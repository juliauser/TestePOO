public class Produto {
    private int id;
    private String nome;
    private Double estoque;

    public void escrever() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Estoque: " + estoque);
    }

    @Override
    public String toString() {
        return "Produto [id = " + id + ", nome = " + nome + ", estoque = " + estoque + "]";
    }

    public void addEstoque (Double qtde) {
        estoque = estoque + qtde;
    }

    public boolean retirarEstoque(Double qtde) {
        if (this.estoque >= qtde) {
            estoque = estoque - qtde;
            return true;
        } 
            return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }
 
    

}
