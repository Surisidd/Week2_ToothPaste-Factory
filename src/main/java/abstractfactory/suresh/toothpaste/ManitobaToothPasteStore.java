
package abstractfactory.suresh.toothpaste;

public class ManitobaToothPasteStore extends ToothPasteStore{
    protected ToothPaste createToothPaste(String item){
        ToothPaste toothPaste = null;
        
        ToothPasteIngredientFactory ingredientFactory = new CLToothPasteIngredientFactory();
        
        
        
        if(item.equalsIgnoreCase("colgate")){
            toothPaste = new   ColgateToothPaste(ingredientFactory);
            toothPaste.setName("Manitoba Style tooth Paste with");
            System.out.println("Creating tooth paste");
        }
        else if(item.equalsIgnoreCase("Rembrandt")){
            toothPaste = new   RembrandtToothPaste(ingredientFactory);
            toothPaste.setName("Manitoba Style tooth Paste with");
        }
        else if(item.equalsIgnoreCase("TheraBreath")){
            toothPaste = new   TheraBreathToothPaste(ingredientFactory);
            toothPaste.setName("Manitoba Style tooth Paste with");
        }
        else if(item.equalsIgnoreCase("CrestTartar")){
            toothPaste = new   CrestTartarToothPaste(ingredientFactory);
            toothPaste.setName("Manitoba Style tooth Paste with");
        }
        else if(item.equalsIgnoreCase("Sensodyne")){
            toothPaste = new   SensodyneToothPaste(ingredientFactory);
            toothPaste.setName("Manitoba Style tooth Paste with");
        }        
        return toothPaste;
    }    
}
