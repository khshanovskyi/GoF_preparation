package structural.composite;

import java.util.List;

public class ImageEditor {
    private CompoundGraphic all;

    void load(){
        all = new CompoundGraphic();
        all.add(new Dot(2,3));
        all.add(new Circle(4,4,2));
    }

    void groupSelected(List<Graphic> graphics){
        CompoundGraphic group =  new CompoundGraphic();

        for (Graphic graphic: graphics) {
            group.add(graphic);
            all.remove(graphic);
        }
        all.add(group);
        all.draw();
    }
}
