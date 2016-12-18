/**
 * Created by MałaMi on 2016-12-18.
 */
public class Guitar {
    String guitarType;
    String producer;
    String model;
    String color;
    int numberOfPicks;
    int numberOfStrings;
    char leftRightHanded;

    Guitar(String gt, String pr, String mdl, String clr, int nop, int nos, char lrh){
        guitarType = gt;
        producer = pr;
        model = mdl;
        color = clr;
        numberOfPicks = nop;
        numberOfStrings = nos;
        leftRightHanded = lrh;
    }
}
