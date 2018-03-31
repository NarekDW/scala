package tail_rec;

public class TailRec {

    public static void main(String[] args) throws Exception {

        new TailRec().tail(3);

    }

    /*
    Recursion!
    Exception in thread "main" java.lang.Exception: Booom!
        at tail_rec.TailRec.tail(TailRec.java:14)
        at tail_rec.TailRec.tail(TailRec.java:15)
        at tail_rec.TailRec.tail(TailRec.java:15)
        at tail_rec.TailRec.tail(TailRec.java:15)
        at tail_rec.TailRec.main(TailRec.java:7)
     */
    public int tail(int x) throws Exception {
        if (x == 0)
            throw new Exception("Booom!");
        else return tail(x - 1);
    }

}
