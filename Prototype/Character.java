    package prototype;
public abstract class Character implements Cloneable {
    private int id;
    protected String className;
    abstract void fight();
    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public String getClassName(){
        return className;
    }
   
    
    
    public Object shallow(){

        Object clone = this;
        return clone;
    }

    public Object clone() throws CloneNotSupportedException {
      Object clone = null;
        try {
        clone = super.clone(); 
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return clone;
   }
}
