
package abstractfactory.suresh.toothpaste;

public abstract class ToothPasteStore {
    
    protected abstract ToothPaste createToothPaste( String item);
    
    public ToothPaste orderToothPaste(String pasteType){
        ToothPaste toothPaste = createToothPaste(pasteType);
        System.out.println("---- Making a " + toothPaste.getName() + " ----");
        toothPaste.prepare();
        toothPaste.weighing();
        toothPaste.mixing();
        toothPaste.fillingTubes();
        toothPaste.packaging();
        toothPaste.qualityControl();

        return toothPaste;
    }
}
