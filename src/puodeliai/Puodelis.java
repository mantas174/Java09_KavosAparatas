package puodeliai;

public class Puodelis {
    private float puodelioMaxTalpa;
    private float puodelioTalpa;

    public float getPuodelioMaxTalpa() {
        return puodelioMaxTalpa;
    }

    public void setPuodelioMaxTalpa(float puodelioMaxTalpa) {
        this.puodelioMaxTalpa = puodelioMaxTalpa;
    }

    public float getPuodelioTalpa() {
        return puodelioTalpa;
    }

    public void setPuodelioTalpa(float puodelioTalpa) {
        this.puodelioTalpa = puodelioTalpa;
    }



    public String rodykInformacija(){
        return "puodelio talpa: " +puodelioTalpa;
    }

}
