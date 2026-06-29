public class Main {
    public static void main(String[] args) {
        // Tao mang cac hinh Shape
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0); // Ban kinh 5
        shapes[1] = new Rectangle(4.0, 6.0); // Rong 4, dai 6
        shapes[2] = new Square(3.0); // Canh 3

        System.out.println("Kiem tra interfaces resizeable");

        for (Shape shape : shapes) {
            System.out.println("\nLoai hinh: " + shape.getClass().getSimpleName());

            // De lay dien tich, ta can ep kieu ve cac lop tuong ung do Shape khong co phuong thuc getArea()
            double areaBefore = 0.0;
            if (shape instanceof Circle) {
                areaBefore = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) { // Square cung la Rectangle
                areaBefore = ((Rectangle) shape).getArea();
            }

            System.out.println("Dien tich truoc khi tang: " + areaBefore);

            // Tao ti le ngau nhien tu 1 den 100
            double randomPercent = Math.floor(Math.random() * 100) + 1;
            System.out.println("Ty le tang (%): " + randomPercent);

            // Ep kieu sang Resizeable de goi phuong thuc resize
            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(randomPercent);
            }

            // Lay dien tich sau khi tang
            double areaAfter = 0.0;
            if (shape instanceof Circle) {
                areaAfter = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                areaAfter = ((Rectangle) shape).getArea();
            }

            System.out.println("Dien tich sau khi tang:   " + areaAfter);
        }
    }
}