package MelodicMinor4Major_II_V_I;

import java.util.Scanner;

/**
 * @author Sakari Angervuori
 */
public class MainActivity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input key for the Major II V I progression");
        Scanner key = new Scanner(System.in);
        String keyNote = key.nextLine();
        int jatka = 1;

        while (jatka == 1) {

            if (jatka == 1) {

                System.out.println("1: I (Ma7#5) 2: II (Dorian b2) 3: V (Lyd.dom) 4: V (Aeol.dom) ");
                int valinta = input.nextInt();
                switch (valinta) {

                    case 1:
                        I_LydianAug lydianAug_I = new I_LydianAug(keyNote);
                        LydianAug lydianAug = new LydianAug(lydianAug_I.newRoot4I);
                        System.out.println("Ma7#5 Lydian augmented scale for MA7 on I");
                        System.out.println(" W W W W H W H ");
                        System.out.println(lydianAug.newScale);
                        //define the melodic minor scale used for I
                        System.out.println("Melodic minor scale on " + lydianAug_I.newRoot4MMScale);
                        break;
                    case 2:
                        II_Dorianb2 dorb2_II = new II_Dorianb2(keyNote);
                        //define the key note for II
                        Dorianb2 dorianb2 = new Dorianb2(dorb2_II.newRoot4II);
                        System.out.println("Dorian b2 scale for mi7 on II");
                        System.out.println(" H W W W W H W ");
                        System.out.println(dorianb2.newScale);
                        //define the melodic minor scale used for I
                        System.out.println("Melodic minor scale on " + dorb2_II.newRoot4MMScale);
                        break;
                    case 3:
                        V_LydianDom lydianDom_V = new V_LydianDom(keyNote);
                        //define the key note for V
                        LydianDom lydianDom = new LydianDom(lydianDom_V.newRoot4V);
                        System.out.println("Lydian dominant/Acoustic scale for 7 cord on V");
                        System.out.println(" W W W H W H W ");
                        System.out.println(lydianDom.newScale);
                        //define the melodic minor scale used for V
                        System.out.println("Melodic minor scale on " + lydianDom_V.newRoot4MMScale);
                        break;
                    case 4:
                        V_AeolianDom aeolianDom_V = new V_AeolianDom(keyNote);
                        //define the key note for V
                        AeolianDom aeolianDom = new AeolianDom(aeolianDom_V.newRoot4V);
                        System.out.println("Aeolian dominant scale for 7 cord on V");
                        System.out.println(" W W H W H W W ");
                        System.out.println(aeolianDom.newScale);
                        //define the melodic minor scale used for V
                        System.out.println("Melodic minor scale on " + aeolianDom_V.newRoot4MMScale);
                        break;
                }
                System.out.println("Jatka, paina 1 ");
                jatka = input.nextInt();
            }
        }

    }
}

/*
 points.put("WHWWWWH","mi Ma7 Melodic minor scale" );
        points.put("HWWWWHW","mi7 Dorian b2 scale" );
        points.put("WWWWHWH","Ma7#5 Lydian augmented scale" );
        points.put("WWWHWHW","7 Lydian dom./Acoustic scale" );
        points.put("WWHWHWW","7 Aeolian dom. scale" );
        points.put("WHWHWWW","mi7b5 Half dim. scale" );
        points.put("HWHWWWW","7 Altered scale" );
 */
