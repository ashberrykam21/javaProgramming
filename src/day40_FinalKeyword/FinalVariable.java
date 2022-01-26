package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    public FinalVariable(String birthDay){
        this.birthDay = birthDay;
    }
    static{
        name = "Batch 25";
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        //pi = 4.15; final variables can not be reassigned

        final String name;
        name = "Wooden Spoon";
        //name = "Jave"; can bot reassign
        System.out.println(name);

        System.out.println("--------------------------------");

        FinalVariable obj = new FinalVariable("May/01");
        //obj.birthDay ="June/15";//final variable can not be reassign
        System.out.println(obj.birthDay);

        System.out.println("------------------------------------");

        //FinalVariable.name = "Python";


    }
}
