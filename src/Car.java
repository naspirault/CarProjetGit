import java.util.Comparator;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int nbDoors;
    private boolean isElectric;

    public Car (){}
    public Car (String aBrand, String aModel, String aColor, int aNbDoors, boolean aIsElectric){
        brand = aBrand;
        model = aModel;
        color = aColor;
        nbDoors = aNbDoors;
        isElectric= aIsElectric;}
    public void setBrand(String aBrand) { brand = aBrand; }
    public String getBrand() { return brand; }
    public void setModel(String aModel) { model = aModel;  }
    public String getModel() { return  model; }
    public void setColor(String aColor){ color = aColor; }
    public String getColor() { return color;  }
    public void setNbDoors(int aNbDoors) { nbDoors = aNbDoors;    }
    public int getNbDoors(){ return nbDoors; }
    public void setElectric(boolean aIsElectric) { isElectric = aIsElectric;    }
    public boolean getIsElectric() {return isElectric; }

    @Override
    public String toString(){
        String txt = "";
        txt = "Voiture { marque = '"+getBrand() +"', ";
        txt += "modèle = '"+getModel()+"', ";
        txt += "couleur = '"+getColor()+"', ";
        txt += "nombre de portes = " +getNbDoors()+", ";
        txt += "est électrique = "+getIsElectric() + " }";
        return txt;
    }
}
