public class UTENTE {
    private final String name;
    private final String gender;
    private final int age;
    private final float height;
    private int weight;
    private float valorIMC;
    private String estadoPeso;

    public UTENTE(String name, String gender, int age, float height, int weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setValorIMC(float valorIMC) {
        this.valorIMC = valorIMC;
    }

    public void setEstadoPeso(String estadoPeso) {
        this.estadoPeso = estadoPeso;
    }

    @Override
    public String toString() {
        return "UTENTE{" +
                "Nome='" + name + '\'' +
                ", Género='" + gender + '\'' +
                ", Idade=" + age +
                ", Altura=" + height +
                ", Peso=" + weight +
                ", valorIMC=" + valorIMC +
                ", Estado Físico='" + estadoPeso + '\'' +
                '}';
    }
}
