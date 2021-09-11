
package abstractfactory.suresh.toothpaste;

public abstract class ToothPaste {
    String name;
    
    AluminiumHydroxide aluminuimHydroxide;
    CalciumCarbonate calciumCarbonate;
    Triclosan triclosan;
    Chlorhexidine chlorhexidine;
    Peppermint peppermint;
    Spearmint spearmint;
    WinterGreen winterGreen;
    SodiumFlouride sodiumFlouride;
    LaurylSulfate laurylSulfate;
    
    abstract void prepare();
    
    void weighing(){
        System.out.println("");
    }
    void mixing(){
        System.out.println("");
    }
    void fillingTubes(){
        System.out.println("");
    }
    void packaging(){
        System.out.println("");
    }
    void qualityControl(){
        System.out.println("");
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
        return display.toString();
    }
}
