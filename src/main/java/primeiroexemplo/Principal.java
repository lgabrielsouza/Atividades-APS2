package primeiroexemplo;

public class Principal {
    public static void main(String[] args){
        Banco b1 = new Banco ("Lucas", "0000", 10);
        Banco b2 = new Banco();
        Banco b3 = new Banco();

        /*System.out.println(b2.saldo);
        b2.saldo = 1000;
        System.out.println(b2.saldo);*/

        System.out.println(b3.getNome());//Mostrar
        b3.setNome("João"); //Atualizar
        System.out.println(b3.getNome()); //Mostrar valor atualizado

        /*System.out.println("Hello World");*/
    }
}
