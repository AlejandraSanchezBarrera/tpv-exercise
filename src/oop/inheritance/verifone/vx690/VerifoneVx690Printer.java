package oop.inheritance.verifone.vx690;

public class VerifoneVx690Printer {
    private static VerifoneVx690Printer uniqueInstance;

    private VerifoneVx690Printer(){

    }

    public static VerifoneVx690Printer getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new VerifoneVx690Printer();
        }
        return uniqueInstance;
    }
    /**
     * Prints a message on the current line at the specified horizontal position
     *
     * @param x       horizontal offset
     * @param message Message to be printed
     */
    public void print(int x, String message) {

    }

    /**
     * Add a line break to the paper
     */
    public void lineFeed() {
    }

}
