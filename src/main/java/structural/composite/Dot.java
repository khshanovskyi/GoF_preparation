package structural.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dot implements Graphic{
    private int x;
    private int y;


    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("x = " + x + ", y = " + y);
    }
}
