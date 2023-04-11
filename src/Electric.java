public enum Electric {
    ELECTRIC("La voiture est 100% électrique!"),
    GAZ("La voiture est au gaz uniquement."),
    HYBRID("La voiture est hybride.");

    String electric;

    private Electric(String elec) {
        this.electric = elec;
    }
}