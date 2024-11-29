public class Triangle extends Shape {
  // public Triangle(String name, Float base, Float height) {
  //   super(name);
  //   this.base = base;
  //   this.height = height;
  // }

  // public Triangle(String name, Float side) {
  //   super(name);
  //   this.side = side;
  // }

  public Triangle(Float base, Float height, Float side) {
    this.base = base;
    this.height = height;
    this.side = side;
  }

  public Float base, height, side;

  // public Float area() {
  //   return 0.5f * base * height;
  // }

  // public Float perimeter() {
  //   return side + side + side;
  // }

  // overloading
  public Float process(Float base, Float height) {
    return 0.5f * base * height;
  }

  public Float process(Float side) {
    return side + side + side;
  }

  public Float process(Float base, Float height, Float prismHeight) {
    return ((base * height) / 2) * prismHeight;
  }
  
  // @Override
  // public void displayInfo() {
  //   super.displayInfo();
  //   System.out.println("Luas: " + process(base, height));
  // }

  @Override
  public void result(String name, String type) {
    // TODO Auto-generated method stub
    super.result(name, type);
    if (type.equalsIgnoreCase("area")) {
      System.out.println(process(base, height));
    } else if (type.equalsIgnoreCase("around")) {
      System.out.println(process(side));
    } else {
      System.out.println(process(base, height, height));
    }
  }
}
