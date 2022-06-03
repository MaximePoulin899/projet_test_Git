package model;

public class Bebay {
    private String nom;
    private String dateBirth;

    private int age;
    private String sexe;


    public Bebay(String nom, String dateBirth, int age) {
        this.nom = nom;
        this.dateBirth = dateBirth;
        this.age = age;
    }

    public Bebay(String nom, String dateBirth) {
        this.nom = nom;
        this.dateBirth = dateBirth;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
}
