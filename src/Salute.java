public class Salute {
    private String name;
    private int hour;
    public Salute(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }

    public String toString() {
        if(this.hour >=6 && this.hour < 12){
            return "¡Buenos días " + this.name+ "!";
        } else if(this.hour >=12 && this.hour <20) {
            return "¡Buenas tardes " + this.name + "!";
        }
        else {
            return "¡Buenas noches " + this.name+ "!";
        }

    }
}
