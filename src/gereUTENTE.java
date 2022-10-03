import java.util.ArrayList;
import java.util.Scanner;
public class gereUTENTE {
    private final ArrayList<UTENTE> lista;

    public gereUTENTE() {
        lista = new ArrayList<>();
    }

    public void calcIMC(String name) {
        UTENTE temp = obterUtente(name);
        float IMC = (temp.getWeight() / (temp.getHeight() * temp.getHeight()));
        System.out.println("IMC: " + IMC);
        temp.setValorIMC(IMC);
        float pesoSuposto;
        if (IMC < 19) {
            pesoSuposto = temp.getHeight() * temp.getHeight() * 25;
            System.out.println("Abaixo do Peso Normal. Para ser considerado peso ideal necessita de :  " + pesoSuposto + "Kg");
            temp.setEstadoPeso("Abaixo do peso Normal");
        } else if (IMC < 25) {
            System.out.println("Peso Normal.");
            temp.setEstadoPeso("Peso Normal");
        } else if (IMC < 30) {
            System.out.println("Excesso de Peso");
            pesoSuposto = temp.getHeight() * temp.getHeight() * 25;
            System.out.println("Excesso de Peso. Para ser considerado peso ideal necessita de :   " + pesoSuposto + "Kg");
            temp.setEstadoPeso("Excesso de Peso");
        } else {
            pesoSuposto = temp.getHeight() * temp.getHeight() * 25;
            System.out.println("Obeso. Para ser considerado peso ideal necessita de :   " + pesoSuposto + "Kg");
            temp.setEstadoPeso("Obeso");
        }
    }

    public void insereUTE(String name, String gender, int age, float height, int weight) {
        UTENTE temp = obterUtente(name);
        if (temp == null) {
            UTENTE novoUT = new UTENTE(name, gender, age, height, weight);
            lista.add(novoUT);
        } else {
            System.out.println("Utente já existe!");
        }
    }

    public void imprimirDetails(String name) {
        UTENTE temp = obterUtente(name);
        if (temp != null) {
            System.out.println(temp);
        } else {
            System.out.println("Utente não existe");
        }
    }

    public void alterarPeso(String name) {
        UTENTE temp = obterUtente(name);
        if (temp != null) {
            Scanner inputInt = new Scanner(System.in);
            System.out.println("Novo Peso:");
            int weight = inputInt.nextInt();
            temp.setWeight(weight);
            calcIMC(name);
            imprimirDetails(name);
        }
    }


    public boolean listarUtentes() {
        boolean vazia = true;
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ". " + lista.get(i).getName());
            vazia = false;
        }
        return vazia;
    }

    public void listarDetalhesUtentes() {
        if (lista.size() == 0) {
            System.out.println("Ainda não existem Utentes inseridos!");
        } else {
            for (UTENTE utente : lista) {
                System.out.println(utente);
            }
        }
    }

        public UTENTE obterUtente (String name){
            UTENTE temp = null;
            for (UTENTE utente : lista) {
                if (utente.getName().equalsIgnoreCase(name)) {
                    temp = utente;
                }
            }
            return temp;
        }
    }





