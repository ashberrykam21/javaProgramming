package day42_Exeptions;

class FadyException extends RuntimeException{//custom checked exception

    public FadyException(){
        super("It's time for a short break");
    }

    public FadyException(String message){
        super(message);
    }

}

class NoBreakException extends Exception{//custom unchecked exception

}

public class CustomExceptions {

    public static void main(String[] args) {

        //throw new FadyException("It's time for lunch");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}
