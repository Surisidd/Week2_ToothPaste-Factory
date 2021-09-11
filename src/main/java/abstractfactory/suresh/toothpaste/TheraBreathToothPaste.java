
package abstractfactory.suresh.toothpaste;

public class TheraBreathToothPaste extends ToothPaste{
    ToothPasteIngredientFactory ingredientFactory;
    
    public TheraBreathToothPaste(ToothPasteIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        sodiumFlouride = ingredientFactory.createSodiumFlouride();
        calciumCarbonate = ingredientFactory.createCalciumCarbonate();
        
    }       
}
