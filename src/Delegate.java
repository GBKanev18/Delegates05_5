public class Delegate {

    private String name;
    private String EGN;
    private String town;

    private String sex;
    private double roadExpences;

    public Delegate(){

        this.name = "Kunchou";
        this.EGN = "86005654221";
        this.town = "Burgas";
        this.sex = "male";
        this.roadExpences = 130.60;

    }

    public Delegate(String name, String EGN, String town, double roadExpences){

        this.name = name;
        this.EGN = EGN;
        this.town = town;
        this.sex = sex;
        this.roadExpences = roadExpences;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getSex(String sex){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public double getRoadExpences() {
        return roadExpences;
    }

    public void setRoadExpences(double roadExpences) {
        this.roadExpences = roadExpences;
    }

    @Override
    public String toString() {
        return "Delegate{" +
                "name='" + name + '\'' +
                ", EGN='" + EGN + '\'' +
                ", town='" + town + '\'' +
                ", roadExpences=" + roadExpences +
                '}';
    }


    public void add(Delegate delegate) {
    }
}
