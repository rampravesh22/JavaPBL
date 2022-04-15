public class Box {
    int width, height, depth;

    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    int getVolume() {
        return this.depth * this.height * this.width;
    }

    public static void main(String[] args) {
        Box b1 = new Box(1, 2, 3);
        System.out.println("Volume of the box is " + b1.getVolume());

    }

}
