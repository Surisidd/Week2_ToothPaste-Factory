
 public Toothpaste(ToothpasteType model,size) {
    this.model = model;
    this.location =location;
    this.size = size;
  }
 
  protected abstract void construct();
 
  private ToothpasteType model = null;
  private Size size = null;
 
 
  @Override
  public String toString() {
    return "Model- "+model + " create in "+location;
  }
}