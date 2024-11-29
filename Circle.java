public class Circle extends Shape{
  public Circle(Float r) {
    this.r = r;
  }

  public final float phi = 3.14f;
  public Float r;

  public Float process(Float r, String type) {
    if (type.equalsIgnoreCase("area")) {
      return phi * r * r;
    } else if (type.equalsIgnoreCase("perimeter")) {
      return 2 * phi * r;
    } else {
      return (4f / 3f) * phi * r * r * r;
    }
  }

  @Override
  public void result(String name, String type) {
    super.result(name, type);
    System.out.println(process(r, type));
  }
}
