
package abstractfactory.suresh.toothpaste;

public class WashingtonToothPasteStore {
    protected ToothPaste createToothPaste(String item){
        ToothPaste toothPaste = null;
        
        ToothPasteIngredientFactory ingredientFactory = 
                new CLToothPasteIngredientFactory();
        
        if(item.equalsIgnoreCase("Colgate")){
            toothPaste = new   ColgateToothPaste(ingredientFactory);
            toothPaste.setName("Washington Styple tooth Paste");
        }
        else if(item.equalsIgnoreCase("Rembrandt")){
            toothPaste = new   RembrandtToothPaste(ingredientFactory);
            toothPaste.setName("Washington Style tooth Paste");
        }
        else if(item.equalsIgnoreCase("TheraBreath")){
            toothPaste = new   TheraBreathToothPaste(ingredientFactory);
            toothPaste.setName("Washington Style tooth Paste");
        }
        else if(item.equalsIgnoreCase("CrestTartar")){
            toothPaste = new   CrestTartarToothPaste(ingredientFactory);
            toothPaste.setName("Washington Style tooth Paste");
        }
        else if(item.equalsIgnoreCase("Sensodyne")){
            toothPaste = new   SensodyneToothPaste(ingredientFactory);
            toothPaste.setName("Washington Style tooth Paste");
        }        
        return toothPaste;
    }
}
