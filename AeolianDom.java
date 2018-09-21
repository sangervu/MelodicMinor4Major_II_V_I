package MelodicMinor4Major_II_V_I;

/**
 *
 * @author angervuorisa
 */
public class AeolianDom {

    public String newScale;

    public AeolianDom(String minorKey) {

        String note2, note3, note4, note5, note6, note7, note8;

           String sharpKeys = "D#EA#B";
        String flatKeys = "CFGb";

        WS_Sharp ws_sharp = new WS_Sharp();
        HS_Sharp hs_sharp = new HS_Sharp();
        WS_Flat ws_flat = new WS_Flat();
        HS_Flat hs_flat = new HS_Flat();

        if (sharpKeys.contains(minorKey)
                || minorKey.contains("C#") || minorKey.contains("F#") || minorKey.contains("G#")) {

            //System.out.println("Aeolian dominant scale for V cord (7)");
            //System.out.println(" W W H W H W W ");
            //intervalli1 = "W";
            note2 = ws_sharp.getScales(minorKey);

            //intervalli2 = "W";
            note3 = ws_sharp.getScales(note2);

            //intervalli3 = "H";
            note4 = hs_sharp.getScales(note3);

            //intervalli4 = "W";
            note5 = ws_sharp.getScales(note4);

            //intervalli5 = "H";
            note6 = hs_sharp.getScales(note5);

            //intervalli6 = "W";
            note7 = ws_sharp.getScales(note6);

            //intervalli7 = "W";
            note8 = ws_sharp.getScales(note7);

            this.newScale = minorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else if (flatKeys.contains(minorKey)
                || minorKey.contains("Db") || minorKey.contains("Eb") || minorKey.contains("Ab") || minorKey.contains("Bb")) {

            //System.out.println("Aeolian dominant scale for V cord (7)");
            //System.out.println(" W W H W H W W ");
            //intervalli1 = "W";
            note2 = ws_flat.getScales(minorKey);

            //intervalli2 = "W";
            note3 = ws_flat.getScales(note2);

            //intervalli3 = "H";
            note4 = hs_flat.getScales(note3);

            //intervalli4 = "W";
            note5 = ws_flat.getScales(note4);

            //intervalli5 = "H";
            note6 = hs_flat.getScales(note5);

            //intervalli6 = "W";
            note7 = ws_flat.getScales(note6);

            //intervalli7 = "W";
            note8 = ws_flat.getScales(note7);

            this.newScale = minorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else {
            System.out.println("This is not a valid key");

        }
    }

}
