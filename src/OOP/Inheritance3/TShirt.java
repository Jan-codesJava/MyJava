package OOP.Inheritance3;

final public class TShirt extends Shirt{
    String COLOR;
    public TShirt() {
      super ("M",  25);
    }
//constructor of Tshirt     parent field
  //  @Override  --> you cam mot override a final method
  //  public String info() {
    //    return "This is info about T-shirt";
  //  }
}
