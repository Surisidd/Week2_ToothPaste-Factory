
package abstractfactory.suresh.toothpaste;

public class RembrandtToothPaste extends ToothPaste{
    ToothPasteIngredientFactory ingredientFactory;
    
    public RembrandtToothPaste(ToothPasteIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        sodiumFlouride = ingredientFactory.createSodiumFlouride();
        triclosan = ingredientFactory.createTriclosan();
        winterGreen = ingredientFactory.createWinterGreen();
        
        

    }        
}
