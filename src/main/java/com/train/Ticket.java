package com.train;

import sun.awt.windows.WPrinterJob;

public class Ticket {
    int numticket;
    int roundtriptick;

    public Ticket(int numticket, int roundtriptick) {
        this.numticket = numticket;
        this.roundtriptick = roundtriptick;
    }



    public void print(){
        System.out.println("Total tickets:" + numticket + "\t" + "Round-trip:" + roundtriptick + "\t" +"Total:" +((1000*(numticket - roundtriptick))+(1800*(roundtriptick))));
    }
}
