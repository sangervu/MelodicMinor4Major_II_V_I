/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MelodicMinor4Major_II_V_I;

/**
 *
 * @author angervuorisa
 */
public class V_AeolianDom {

    public String newRoot4V;
    public String newRoot4MMScale;

    V_AeolianDom(String keyNote) {

         String sharpKeys = "D#EA#B";
        String flatKeys = "CFGb";

        String note2, note3, note4, note5;

        WS_Sharp ws_sharp = new WS_Sharp();
        HS_Sharp hs_sharp = new HS_Sharp();
        WS_Flat ws_flat = new WS_Flat();
        HS_Flat hs_flat = new HS_Flat();

        // Find the root for the V degree       
        // W W H W
        if (sharpKeys.contains(keyNote)
                || keyNote.contains("C#") || keyNote.contains("F#") || keyNote.contains("G#")) {

            //intervalli1 = "W";
            note2 = ws_sharp.getScales(keyNote);

            //intervalli2 = "W";
            note3 = ws_sharp.getScales(note2);

            //intervalli3 = "H";
            note4 = hs_sharp.getScales(note3);

            //intervalli4 = "W";
            note5 = ws_sharp.getScales(note4);

            this.newRoot4V = note5;

        } else if (flatKeys.contains(keyNote)
                || keyNote.contains("Db") || keyNote.contains("Eb") || keyNote.contains("Ab") || keyNote.contains("Bb")) {

            //intervalli1 = "W";
            note2 = ws_flat.getScales(keyNote);

            //intervalli2 = "W";
            note3 = ws_flat.getScales(note2);

            //intervalli3 = "H";
            note4 = hs_flat.getScales(note3);

            //intervalli4 = "W";
            note5 = ws_flat.getScales(note4);

            this.newRoot4V = note5;

        } else {

        }

// Find the new root for melodic minor scale used on for Alt V scale       
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
