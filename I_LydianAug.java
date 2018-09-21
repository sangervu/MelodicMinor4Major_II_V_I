package MelodicMinor4Major_II_V_I;

/**
 *
 * @author angervuorisa
 */
public class I_LydianAug {

    public String newRoot4I;
    public String newRoot4MMScale;

    public I_LydianAug(String keyNote) {

        String sharpKeys = "D#EA#B";
        String flatKeys = "CFGb";

        String note2, note3, note4, note5, note6;

        WS_Sharp ws_sharp = new WS_Sharp();
        HS_Sharp hs_sharp = new HS_Sharp();
        WS_Flat ws_flat = new WS_Flat();
        HS_Flat hs_flat = new HS_Flat();

        // Find the root for the I degree       
        // Same root
        if (sharpKeys.contains(keyNote)
                || keyNote.contains("C#") || keyNote.contains("F#") || keyNote.contains("G#")) {

            this.newRoot4I = keyNote;

        } else if (flatKeys.contains(keyNote)
                || keyNote.contains("Db") || keyNote.contains("Eb") || keyNote.contains("Ab") || keyNote.contains("Bb")) {

            this.newRoot4I = keyNote;

        } else {

        }

// Find the new root for melodic minor scale used on for the Lydian Augmented scale       
        // W W H W W
        if (sharpKeys.contains(keyNote)
                || keyNote.contains("C#") || keyNote.contains("F#") || keyNote.contains("G#")) {

            //intervalli1 = "W";
            note2 = ws_sharp.getScales(keyNote);
            //intervalli1 = "W";
            note3 = ws_sharp.getScales(note2);
            //intervalli1 = "H";
            note4 = hs_sharp.getScales(note3);
            //intervalli1 = "W";
            note5 = ws_sharp.getScales(note4);
            //intervalli1 = "W";
            note6 = ws_sharp.getScales(note5);
            this.newRoot4MMScale = note6;

        } else if (flatKeys.contains(keyNote)
                || keyNote.contains("Db") || keyNote.contains("Eb") || keyNote.contains("Ab") || keyNote.contains("Bb")) {

            //intervalli1 = "W";
            note2 = ws_flat.getScales(keyNote);
            //intervalli1 = "W";
            note3 = ws_flat.getScales(note2);
            //intervalli1 = "H";
            note4 = hs_flat.getScales(note3);
            //intervalli1 = "W";
            note5 = ws_flat.getScales(note4);
            //intervalli1 = "W";
            note6 = ws_flat.getScales(note5);
            this.newRoot4MMScale = note6;

        } else {

        }
    }
}
