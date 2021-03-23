import bandeau.Bandeau;

public class Rotation extends Animation {

    public Rotation(){}

    @Override
    public void joueToiSur(Bandeau bandeau) {
        bandeau.setMessage("rotation");
        for (int i = 0; i <= 100; i++) {
            bandeau.setRotation(2 * Math.PI * i / 100);
            bandeau.sleep(100);
        }
    }
}
