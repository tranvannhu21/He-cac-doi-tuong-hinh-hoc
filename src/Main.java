public class Main {
    public static void main(String[] args) {
        // Tao mang cac doi tuong hinh hoc
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Square(5.0); // Khong quen chua it nhat mot Square theo yeu cau
        shapes[2] = new Rectangle(4.0, 6.0);

        System.out.println("Kiem thu interface colorable: ");

        for (Shape shape : shapes) {
            System.out.println("\nLoai hinh: " + shape.getClass().getSimpleName());

            // Lay dien tich dua tren tung loai doi tuong cu the
            double area = 0.0;
            if (shape instanceof Circle) {
                area = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) { // Square ke thua Rectangle nen van thoa man o day
                area = ((Rectangle) shape).getArea();
            }

            System.out.println("Dien tich: " + area);

            // Kiem tra neu doi tuong implements interface Colorable
            if (shape instanceof Colorable) {
                // Ep kieu ve Colorable de goi phuong thuc howToColor()
                Colorable colorableShape = (Colorable) shape;
                colorableShape.howToColor();
            }
        }
    }
}