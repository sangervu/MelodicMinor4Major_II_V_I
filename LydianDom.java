package MelodicMinor4Major_II_V_I;

/**
 *
 * @author angervuorisa
 */
public class LydianDom {

    public String newScale;

    public LydianDom(String majorKey) {

        String note2, note3, note4, note5, note6, note7, note8;

        String sharpKeys = "D#EA#B";
        String flatKeys = "CFGb";

        WS_Sharp ws_sharp = new WS_Sharp();
        HS_Sharp hs_sharp = new HS_Sharp();
        WS_Flat ws_flat = new WS_Flat();
        HS_Flat hs_flat = new HS_Flat();

        if (sharpKeys.contains(majorKey)
                || majorKey.contains("C#") || majorKey.contains("F#") || majorKey.contains("G#")) {

            //System.out.println("Lydian dominant/Acoustic scale for V cord (7)");
            //System.out.println(" W W W H W H W ");
            
            //intervalli1 = "W";
            note2 = ws_sharp.getScales(majorKey);

            //intervalli2 = "W";
            note3 = ws_sharp.getScales(note2);

            //intervalli3 = "W";
            note4 = ws_sharp.getScales(note3);

            //intervalli4 = "H";
            note5 = hs_sharp.getScales(note4);

            //intervalli5 = "W";
            note6 = ws_sharp.getScales(note5);

            //intervalli6 = "H";
            note7 = hs_sharp.getScales(note6);

            //intervalli7 = "W";
            note8 = ws_sharp.getScales(note7);

            this.newScale = majorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else if (flatKeys.contains(majorKey)
                || majorKey.contains("Db") || majorKey.contains("Eb") || majorKey.contains("Ab") || majorKey.contains("Bb")) {

            //System.out.println("Lydian dominant/Acoustic scale for V cord (7)");
            //System.out.println(" W W W H W H W ");
            
            //intervalli1 = "W";
            note2 = ws_flat.getScales(majorKey);

            //intervalli2 = "W";
            note3 = ws_flat.getScales(note2);

            //intervalli3 = "W";
            note4 = ws_flat.getScales(note3);

            //intervalli4 = "H";
            note5 = hs_flat.getScales(note4);

            //intervalli5 = "W";
            note6 = ws_flat.getScales(note5);

            //intervalli6 = "H";
            note7 = hs_flat.getScales(note6);

            //intervalli7 = "W";
            note8 = ws_flat.getScales(note7);

            this.newScale = majorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else {
            System.out.println("This is not a valid key");

        }
    }

}
