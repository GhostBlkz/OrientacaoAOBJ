package lista1.lista1;

public class TestaCliente {
    public static void main(String[] args){
        Cliente Fulano1 = new Cliente(001,32323,"Marcos",500.0f);
        Cliente Fulano2 = new Cliente(002,34567,"Margarida",150.0f);

        Fulano1.realizaDeposito(100.0f);
        Fulano1.mostrarDados();
        Fulano1.realizaSaque(300.0f);
        Fulano1.mostrarDados();

        Fulano2.realizaDeposito(50.f);
        Fulano2.mostrarDados();
        Fulano2.realizaSaque(250.0f);
        Fulano2.mostrarDados();

    }

}
