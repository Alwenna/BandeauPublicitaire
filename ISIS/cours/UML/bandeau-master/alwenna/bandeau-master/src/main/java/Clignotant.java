import bandeau.Bandeau;

import java.awt.*;

public class Clignotant extends Animation {

    public Clignotant(){};

    @Override
    public void joueToiSur(Bandeau bandeau) {
        bandeau.setMessage("ça clignote");
        for (int i=0;i<3;i++) {
            bandeau.sleep(50);
            bandeau.setForeground(Color.white);
            bandeau.sleep(50);
            bandeau.setForeground(Color.black);
        }
    }
}
