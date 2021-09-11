
package abstractfactory.suresh.toothpaste;

public class RembrandtToothPaste extends ToothPaste{
    ToothPasteIngredientFactory ingredientFactory;
    
    public RembrandtToothPaste(ToothPasteIngredientFactory ingredient){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
    }        
}
