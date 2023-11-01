package pages;

public class SandBoxPage extends BasePage {
   
    private String Select = "//select[@id='dropdown']";
    //private String click = "//select[@id='dropdown']";
    

    public SandBoxPage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://the-internet.herokuapp.com/dropdown");
    }

    /*public void Clickdropdown(){
        clickElement(click);
    }*/

    public void Dropdown(int category){
        SelectToIndex(Select, category );
    }

}
