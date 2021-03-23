import bandeau.Bandeau;

public class TestAnimation {

    private Bandeau bandeau;

    public TestAnimation(Bandeau bandeau) {
        this.bandeau = bandeau;
    }


    public void ajouteEffet (Animation effet, int rep) {
        for (int i=0;i<rep;i++) {
            effet.joueToiSur(this.bandeau);
        }
    }

}
