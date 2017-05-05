public class Invertir {
    private String palabra;

    public Invertir(String palabra) {
        this.palabra = palabra;
    }


    private String invierte(){

        StringBuilder invertida= new StringBuilder(this.palabra);
        return invertida.reverse().toString();

    }

    @Override
    public String toString() {
        return invierte();
    }
}
