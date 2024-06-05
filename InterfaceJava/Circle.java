interface Area {
    final static float PI = 3.14f;

    void compute();
}

class Circle implements Area {
    int radius;

    Circle(int r) {
        radius = r;
    }

    public void compute() {
        System.out.println("Area is: " + PI * radius * radius);
    }

    public static void main(String args[]) {
        Circle c = new Circle(5);
        c.compute();
    }
}
