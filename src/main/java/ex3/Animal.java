package ex3;

import java.util.Objects;

public class Animal {

    /** Attribut indiquant le nom de l'animal */
    private String nom;

    /** Attribut indiquant le type de l'animal */
    private String type;

    /** Attribut indiquant le comportement de l'animal */
    private String comportement;

    /** Constructeur
     *
     * @param nom
     * @param type
     * @param comportement
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /** Getteur pour le nom
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /** Setteur pour le nom
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /** Getteur pour le type
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /** Setteur pour le type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** Getteur pour le comportement
     *
     * @return
     */
    public String getComportement() {
        return comportement;
    }

    /** Setteur pour le comportement
     *
     * @param comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nom, animal.nom) && Objects.equals(type, animal.type) && Objects.equals(comportement, animal.comportement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, type, comportement);
    }

    @Override
    public String toString() {
        return "Type: " + type +
                "\nNom: " + nom +
                "\nComportement : " + comportement;
    }
}
