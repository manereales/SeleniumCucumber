package pages;

public class GooglePage extends BasePage {
    
   private String searchButtom = "//input[@value='Buscar con Google']";
   private String searchTextField =  "//textarea[@name='q']";

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com/?hl=es");
    }

    public void enterSearchCriterio(String criterio){
        writeElement(searchTextField, criterio);
    }

    public void click(){
        clickElement(searchButtom);
    }

    

}