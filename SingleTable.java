public class SingleTable {
 private int seats;
    private double viewQuality;
    private int height;
    public SingleTable(int s,double v, int h){
        seats =s;
        viewQuality = v;
        height =h;
    } /**
     * Returns the number of seats at this table. The value is always greater than
     * or equal to 4.
     */
   
    public int getNumSeats() {
    /* implementation not shown */ 
        return seats;}
    }

