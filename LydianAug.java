package MelodicMinor4Major_II_V_I;

/**
 *
 * @author angervuorisa
 */
public class LydianAug {

    public String newScale;

    public LydianAug(String minorKey) {

        String note2, note3, note4, note5, note6, note7, note8;

        String sharpKeys = "D#EA#B";
        String flatKeys = "CFGb";

        WS_Sharp ws_sharp = new WS_Sharp();
        HS_Sharp hs_sharp = new HS_Sharp();
        WS_Flat ws_flat = new WS_Flat();
        HS_Flat hs_flat = new HS_Flat();

        if (sharpKeys.contains(minorKey)
                || minorKey.contains("C#") || minorKey.contains("F#") || minorKey.contains("G#")) {

            //System.out.println("Ma7#5 Lydian augmented scale");
            //System.out.println(" W W W W H W H ");
            //intervalli1 = "W";
            note2 = ws_sharp.getScales(minorKey);

            //intervalli2 = "W";
            note3 = ws_sharp.getScales(note2);

            //intervalli3 = "W";
            note4 = ws_sharp.getScales(note3);

            //intervalli4 = "W";
            note5 = ws_sharp.getScales(note4);

            //intervalli5 = "H";
            note6 = hs_sharp.getScales(note5);

            //intervalli6 = "W";
            note7 = ws_sharp.getScales(note6);

            //intervalli7 = "H";
            note8 = hs_sharp.getScales(note7);

            this.newScale = minorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else if (flatKeys.contains(minorKey)
                || minorKey.contains("Db") || minorKey.contains("Eb") || minorKey.contains("Ab") || minorKey.contains("Bb")) {

            //System.out.println("Ma7#5 Lydian augmented scale");
            //System.out.println(" W W W W H W H ");
            //intervalli1 = "W";
            note2 = ws_flat.getScales(minorKey);

            //intervalli2 = "W";
            note3 = ws_flat.getScales(note2);

            //intervalli3 = "W";
            note4 = ws_flat.getScales(note3);

            //intervalli4 = "W";
            note5 = ws_flat.getScales(note4);

            //intervalli5 = "H";
            note6 = hs_flat.getScales(note5);

            //intervalli6 = "W";
            note7 = ws_flat.getScales(note6);

            //intervalli7 = "H";
            note8 = hs_flat.getScales(note7);

            this.newScale = minorKey + " " + note2 + " " + note3 + " " + note4 + " " + note5 + " " + note6 + " " + note7 + " " + note8;

        } else {
            System.out.println("This is not a valid key");

        }
    }

}
