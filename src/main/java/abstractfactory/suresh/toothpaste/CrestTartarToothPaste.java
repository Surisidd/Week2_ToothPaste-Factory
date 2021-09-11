
package abstractfactory.suresh.toothpaste;

public class CrestTartarToothPaste extends ToothPaste{
    ToothPasteIngredientFactory ingredientFactory;
    
    public CrestTartarToothPaste(ToothPasteIngredientFactory ingredient){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
    }       
}
