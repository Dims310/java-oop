public class Day5 {
  public static void main(String[] args) {
    
  // Square square = new Square("Kotak", "Kuning", 5f);
  // System.out.println(square.name + " " + square.color + ", luas: " + square.area());

  // Triangle triangle = new Triangle("Segitiga 1");
  // System.out.println("Keliling: " + triangle.process(3f));
  // System.out.println("Luas: " + triangle.process(3f, 9f));
  // System.out.println("Volume: " + triangle.process(3f, 3f, 5f));

  // Triangle triangle2 = new Triangle("Segitiga 2", 3f, 7f);
  // triangle2.displayInfo();

  Triangle triangle3 = new Triangle(5f, 7f, 8f);
  triangle3.result("Segitiga 3: ", "area");
  triangle3.result("Segitiga 3: ", "around");

  Circle circle1 = new Circle(2f);
  circle1.result("Lingkaran Siji: ", "area");
  circle1.result("Lingkaran Siji: ", "volume");

  Square square1 = new Square(4f);
  square1.result("Square 1: ", "area");
  }
}
