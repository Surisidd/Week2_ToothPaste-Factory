
package abstractfactory.suresh.toothpaste;

public class SensodyneToothPaste extends ToothPaste{
    ToothPasteIngredientFactory ingredientFactory;
    
    public SensodyneToothPaste(ToothPasteIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        silica = ingredientFactory.createSilica();
        peppermint = ingredientFactory.createPeppermint();
        sodiumFlouride = ingredientFactory.createSodiumFlouride();
        
        

    }    
}
