
package abstractfactory.suresh.toothpaste;

public class TheraBreathToothPaste extends ToothPaste{
    ToothPasteIngredientFactory ingredientFactory;
    
    public TheraBreathToothPaste(ToothPasteIngredientFactory ingredient){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
    }       
}
