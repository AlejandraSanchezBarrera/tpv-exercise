package oop.inheritance.ingenico;

public class IngenicoPrinter {
    private static IngenicoPrinter uniqueInstance;

    private IngenicoPrinter(){

    }

    public static IngenicoPrinter getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new IngenicoPrinter();
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
