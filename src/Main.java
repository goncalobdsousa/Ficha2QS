import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gereUTENTE novaLista = new gereUTENTE();
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        Scanner inputFloat = new Scanner(System.in);
        showMenu();
        int escolha = inputInt.nextInt();
        while (escolha!=0) {
            switch (escolha) {
                case 1 -> {
                    String gender;
                    System.out.println("Insira os dados do utente BBB:");
                    System.out.println("Nome:");
                    String name = inputStr.nextLine();
                    if((novaLista.obterUtente(name)) == null){
                        System.out.println("Género:");
                        System.out.println(" 1 - Masculino ");
                        System.out.println(" 2 - Feminino ");
                        int selecaoGenero = inputInt.nextInt();
                        if(selecaoGenero == 1){
                            gender = "Masculino";
                        } else {
                            gender = "Feminino";
                        }
                        System.out.println("Idade:");
                        int age = inputInt.nextInt();
                        System.out.println("Altura:");
                        float height = inputFloat.nextFloat();
                        System.out.println("Peso:");
                        int weight = inputInt.nextInt();
                        novaLista.insereUTE(name, gender, age, height, weight);
                        novaLista.calcIMC(name);
                    }else {
                        System.out.println("Utente já existe!");
                    }
                }
                case 2 -> {
                    if (!novaLista.listarUtentes()) {
                        System.out.println("Insira o nome do utente que pretende alterar o peso na lista.");
                        String name = inputStr.nextLine();
                        novaLista.imprimirDetails(name);
                        novaLista.alterarPeso(name);
                    } else {
                        System.out.println("Ainda não existem Utentes inseridos!");
                    }
                }
                case 3 -> {
                    if (!novaLista.listarUtentes()) {
                        System.out.println("Nome do Utento contido na lista:");
                        String name = inputStr.nextLine();
                        novaLista.imprimirDetails(name);
                    } else {
                        System.out.println("Ainda não existem Utentes inseridos!");
                    }
                }
                case 4 -> novaLista.listarDetalhesUtentes();
                default -> System.out.println("Insira uma opção válida!");
            }
            showMenu();
            escolha = inputInt.nextInt();
        }

    }


    /**
     * Disponibiliza um menu de opção que corresponde aos diversos metodos pedidos no exercicio.
     */
    private static void showMenu() {
        System.out.println("1. Inserir Utente na lista.");
        System.out.println("2. Alterar Peso do Utente.");
        System.out.println("3. Imprimir Dados de um Utente.");
        System.out.println("4. Listar Todos os Utentes e Detalhes.");
        System.out.println("0. Sair");
    }

}
