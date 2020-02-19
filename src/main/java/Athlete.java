public class Athlete {

    private Integer mass;
    private Integer strength;

    public Athlete(Integer mass, Integer strength) {
        this.mass = mass;
        this.strength = strength;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "mass=" + mass +
                ", strength=" + strength +
                '}';
    }
}
