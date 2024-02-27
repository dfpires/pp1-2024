public class MainCliente {
    public static void main(String args[]){
        Cliente obj1 =
  new Cliente(123, 456, "Fulano", 0);

        Cliente obj2 =
  new Cliente(321, 654, "Beltrano", 0);

        obj1.depositar(1000);
        obj1.sacar(400);
        System.out.println(obj1.toString());

        obj2.depositar(1000);
        obj2.sacar(1400);
        System.out.println(obj2.toString());
    }
}
