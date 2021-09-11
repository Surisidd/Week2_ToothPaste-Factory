
package abstractfactory.suresh.toothpaste;

public class CrestTartarToothPaste extends ToothPaste{
    ToothPasteIngredientFactory ingredientFactory;
    
    public CrestTartarToothPaste(ToothPasteIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name);
        aluminuimHydroxide = ingredientFactory.createAluminuimHydroxide();
        spearmint = ingredientFactory.createSpearmint();
        laurylSulfate = ingredientFactory.createLaurylSulfate();
        chlorhexidine = ingredientFactory.createChlorhexidine();
        

    }       
}
