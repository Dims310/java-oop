public class Square extends Shape{
  // public Square(String name, Float side) {
  //   super(name);
  //   this.side = side;
  // }

  public Square(Float side) {
    this.side = side;
  }

  public Float side;

  public Float process(Float side, String type) {
    if (type.equals("area")) {
      return side * side;
    } else if (type.equals("perimeter")) {
      return 4 * side;
    } else {
      return side * side * side;
    }
  }

  @Override
  public void result(String name, String type) {
    super.result(name, type);
    System.out.println(process(side, type));
  }
}
