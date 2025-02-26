import javax.swing.JOptionPane;

public class TesteClasse {
    public static void main(String[] args) {
        Produto p =new Produto();
        p.setId(1);
        p.setNome("Lápis");
        p.setEstoque(20.0);

        p.addEstoque(10.0);

        if(p.retirarEstoque(20.0)) {
            System.out.println("Retirada Ok");
        } else {
            System.out.println("Retirada Erro");
        }

        System.out.println(p.toString());

        Produto p1 = new Produto();
        //p1.id = 2;
        //p1.nome = "Borracha";
        //p1.estoque = 50.0;

        //JOptionPane.showMessageDialog(null, p1.toString());

    }
}
