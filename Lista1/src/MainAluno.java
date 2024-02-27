//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        Aluno obj2 =
    new Aluno(123, "Fulano", 19, 7.5f, 8.5f );
        System.out.println(obj2.dadosAluno());
        obj2.passou();
    }
}