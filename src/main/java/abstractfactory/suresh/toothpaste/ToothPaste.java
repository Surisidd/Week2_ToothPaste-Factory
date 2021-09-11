
package abstractfactory.suresh.toothpaste;

public abstract class ToothPaste {
    String name;
    Abrasive aluminuimHydroxide;
    Abrasive calciumCarbonate;
    Antibacterial triclosan;
    Antibacterial chlorhexidine;
    Flavants peppermint;
    Flavants spearmint;
    Flavants winterGreen;
    Flourides sodiumFlouride;
    Surfactants laurylSulfate;
    Abrasive silica;
    
    abstract void prepare();
    
    void weighing(){
        System.out.println("Weighing the Ingredients ...");
    }
    void mixing(){
        System.out.println("Mixing the ingredients...");
    }
    void fillingTubes(){
        System.out.println("Filling the tubes...");
    }
    void packaging(){
        System.out.println("Packaging tooth paste into boxes...");
    }
    void qualityControl(){
        System.out.println("Quality Control ensuring safe product for human consumptions");
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    
    public String toString(){
        StringBuilder display = new StringBuilder();
        display.append("---- " + name + "----\n");
        if(aluminuimHydroxide != null){
            display.append(aluminuimHydroxide);
            display.append("\n");
        }
        if(calciumCarbonate != null){
            display.append(calciumCarbonate);
            display.append("\n");
        }
        if(triclosan != null ){
            display.append(triclosan);
            display.append("\n");
        }
        if(chlorhexidine != null ){
            display.append(chlorhexidine);
            display.append("\n");
        }
        if(peppermint != null ){
            display.append(peppermint);
            display.append("\n");
        }
        if(spearmint != null ){
            display.append(spearmint);
            display.append("\n");
        }
        if(winterGreen != null ){
            display.append(winterGreen);
            display.append("\n");
        }
        if(sodiumFlouride != null ){
            display.append(sodiumFlouride);
            display.append("\n");
        }  
        if(laurylSulfate != null ){
            display.append(laurylSulfate);
            display.append("\n");
        }  
        if(silica != null ){
            display.append(silica);
            display.append("\n");
        }         
        return display.toString();
    }
}
