public class RectangleClas {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(15, 25);
        Rectangle rect2 = new Rectangle(20, 40);
        int square1 = rect.sideX * rect.sideY;
        int square2 = rect2.sideX * rect2.sideY;
        int razniza = Math.abs(square2 - square1);

        Rectangle rect3 = new Rectangle();
        Rectangle rect4 = new Rectangle();

        Rectangle[] rectangles = {rect, rect2, rect3, rect4};

        System.out.println(square1 == square2);
        System.out.println(rect3.square() == rect4.square());
        System.out.println(sumSquare(rectangles));

        Rectangle[] rectangles1 = new Rectangle[50];

        Rectangle rect49 = getRect(rectangles1, rect2)[49];

        System.out.println(rect49.square());

    }

    static Rectangle[] getRect(Rectangle[] rectangle, Rectangle rect) {
        for (int j = 0; j < 50; j++) {
            rectangle[j] = rect;
        }
        return rectangle;
    }


    static int sumSquare(Rectangle[] rec) {
        int sum = 0;
        for (int i = 0; i < rec.length; i++) {
            sum += rec[i].square();
        }
        return sum;

    }

}
