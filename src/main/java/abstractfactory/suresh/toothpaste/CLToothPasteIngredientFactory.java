
package abstractfactory.suresh.toothpaste;

public class CLToothPasteIngredientFactory implements ToothPasteIngredientFactory{
    
    public AluminiumHydroxide createAluminuimHydroxide(){
        return new AluminiumHydroxide();
    }
    public CalciumCarbonate createCalciumCarbonate(){
        return new CalciumCarbonate();
    }
    public Triclosan createTriclosan(){
        return new Triclosan();
    }
    public Chlorhexidine createChlorhexidine(){
        return new Chlorhexidine();
    }
    public Peppermint createPeppermint(){
        return new Peppermint();
    }
    public Spearmint createSpearmint(){
        return new Spearmint();
    }
    public WinterGreen createWinterGreen(){
        return new WinterGreen();
    }
    public SodiumFlouride createSodiumFlouride(){
        return new SodiumFlouride();
    }
    public LaurylSulfate createLaurylSulfate(){
        return new LaurylSulfate();
    }
    public Silica createSilica(){
        return new Silica();
    }
}
