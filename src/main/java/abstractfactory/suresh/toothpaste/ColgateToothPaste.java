
package abstractfactory.suresh.toothpaste;

public class ColgateToothPaste extends ToothPaste{
    
    ToothPasteIngredientFactory ingredientFactory;
    
    public ColgateToothPaste(ToothPasteIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        triclosan = ingredientFactory.createTriclosan();
        sodiumFlouride = ingredientFactory.createSodiumFlouride();
        laurylSulfate = ingredientFactory.createLaurylSulfate();
        
        

    }
}
