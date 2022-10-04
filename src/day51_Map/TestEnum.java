package day51_Map;



public class TestEnum {

    public static void main(String[] args) {

        //String browser = "Wooden Spoon";
        Browser browser = Browser.CHROME;
        //Browser browser = Browser.WOODENSPOON; compile error u can not assign not valid data

        switch(browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case OPERA:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;
            default:
                System.out.println("Chrome is selected");
        }


    }
}
