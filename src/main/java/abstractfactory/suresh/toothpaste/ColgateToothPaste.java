
package abstractfactory.suresh.toothpaste;

public class ColgateToothPaste extends ToothPaste{
    
    ToothPasteIngredientFactory ingredientFactory;
    
    public ColgateToothPaste(ToothPasteIngredientFactory ingredient){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
    }
}
