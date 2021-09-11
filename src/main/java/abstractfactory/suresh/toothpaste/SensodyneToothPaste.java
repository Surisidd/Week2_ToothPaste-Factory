
package abstractfactory.suresh.toothpaste;

public class SensodyneToothPaste extends ToothPaste{
    ToothPasteIngredientFactory ingredientFactory;
    
    public SensodyneToothPaste(ToothPasteIngredientFactory ingredient){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
    }    
}
