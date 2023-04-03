public class Car2 {
    private String mark;
    private String model;
    private String color;
    private int nbDoors;
    private boolean isElectric;

    public Car2(String mark, String model, String color, int nbDoors, boolean isElectric) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.nbDoors = nbDoors;
        this.isElectric = isElectric;
    }

    public Car2() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNbDoors() {
        return nbDoors;
    }

    public void setNbDoors(int nbDoors) {
        this.nbDoors = nbDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }
    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Voiture { " +
                "marque = '" + mark + '\'' +
                ", modèle = '" + model + '\'' +
                ", couleur = '" + color + '\'' +
                ", nombre de portes = " + nbDoors +
                ", est électrique = " + isElectric +
                " }";
    }
}
