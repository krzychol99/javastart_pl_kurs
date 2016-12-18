/**
 * Created by MałaMi on 2016-12-18.
 */
public class Instruments {
    public static void main(String[] args) {
        Guitar guitarOne = new Guitar("Electric", "Fender","Stratocaster", "Black", 3,6, 'R');
        Guitar guitarTwo = new Guitar("Bass", "Fender", "Jazz Bass", "Red", 2, 4,'R');

        System.out.println("Guitar_1:\n" + "Type: " + guitarOne.guitarType + "; Producer: " + guitarOne.producer + "; Model: "+ guitarOne.model
                + "; Color: " + guitarOne.color + "; Number of picks: " + guitarOne.numberOfPicks
                + "; Number of strings: " + guitarOne.numberOfStrings + "; Left or right handed:  " + guitarOne.leftRightHanded);
        System.out.println("Guitar_2:\n" + "Type: " + guitarTwo.guitarType + "; Producer: " + guitarTwo.producer + "; Model: "+ guitarTwo.model
                + "; Color: " + guitarTwo.color + "; Number of picks: " + guitarTwo.numberOfPicks
                + "; Number of strings: " + guitarTwo.numberOfStrings + "; Left or right handed:  " + guitarTwo.leftRightHanded);
    }
}
