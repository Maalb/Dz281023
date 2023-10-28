public class Rectangle {
    int sideX;
    int sideY;

    Rectangle(){
       sideX = 15;
       sideY = 15;
    }

    Rectangle(int newsideX, int newSideY){
        sideX = newsideX;
        sideY = newSideY;
    }
    int square(){
        int sqar= sideX*sideY;
        return sqar;
    }

}
