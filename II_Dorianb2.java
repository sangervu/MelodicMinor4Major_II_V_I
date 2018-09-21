package MelodicMinor4Major_II_V_I;

/**
 *
 * @author angervuorisa
 */
public class II_Dorianb2 {

    public String newRoot4II;
    public String newRoot4MMScale;

    public II_Dorianb2(String keyNote) {

        String sharpKeys = "D#EA#B";
        String flatKeys = "CFGb";

        String note2, note3, note4, note5;

        WS_Sharp ws_sharp = new WS_Sharp();
        HS_Sharp hs_sharp = new HS_Sharp();
        WS_Flat ws_flat = new WS_Flat();
        HS_Flat hs_flat = new HS_Flat();

        // Find the root for the II degree       
        // W
        if (sharpKeys.contains(keyNote)
                || keyNote.contains("C#") || keyNote.contains("F#") || keyNote.contains("G#")) {

            //intervalli1 = "W";
            note2 = ws_sharp.getScales(keyNote);

            this.newRoot4II = note2;

        } else if (flatKeys.contains(keyNote)
                || keyNote.contains("Db") || keyNote.contains("Eb") || keyNote.contains("Ab") || keyNote.contains("Bb")) {

            //intervalli1 = "W";
            note2 = ws_flat.getScales(keyNote);

            this.newRoot4II = note2;

        } else {

        }

// Find the new root for melodic minor scale used on for Dorianb2 scale       
        // Same root note
        if (sharpKeys.contains(keyNote)
                || keyNote.contains("C#") || keyNote.contains("F#") || keyNote.contains("G#")) {

            this.newRoot4MMScale = keyNote;

        } else if (flatKeys.contains(keyNote)
                || keyNote.contains("Db") || keyNote.contains("Eb") || keyNote.contains("Ab") || keyNote.contains("Bb")) {

            this.newRoot4MMScale = keyNote;

        } else {

        }

    }

}
