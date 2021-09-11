
package abstractfactory.suresh.toothpaste;

public class ToothPasteTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ToothPasteStore washingtonStore = new WashingtonToothPasteStore();
        ToothPasteStore manitobaStore = new ManitobaToothPasteStore();
        
        ToothPaste toothPaste = washingtonStore.orderToothPaste("colgate");
        System.out.println("Alice ordered a " + toothPaste + "\n");
        
        toothPaste = manitobaStore.orderToothPaste("therabreath");
        System.out.println("Joe ordered a " + toothPaste + "\n");
        
        toothPaste = washingtonStore.orderToothPaste("sensodyne");
        System.out.println("Susan ordered a " + toothPaste + "\n");
        
        toothPaste = manitobaStore.orderToothPaste("cresttartar");
        System.out.println("Betty ordered a " + toothPaste + "\n");
        
        toothPaste = washingtonStore.orderToothPaste("rembrandt");
        System.out.println("Peris ordered a " + toothPaste + "\n");
    }
    
}
