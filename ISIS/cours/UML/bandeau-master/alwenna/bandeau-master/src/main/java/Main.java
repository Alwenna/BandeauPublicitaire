import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        TestAnimation scenario = new TestAnimation(monBandeau);
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        Zoom zoom = new Zoom();
        Rotation rota = new Rotation();
        Clignotant cligno = new Clignotant();
        scenario.ajouteEffet(zoom,5);
        scenario.ajouteEffet(rota,2);
        scenario.ajouteEffet(cligno,8);
        monBandeau.close();
    }
}
