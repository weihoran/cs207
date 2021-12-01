package src.abstract_factory.circles;

import src.abstract_factory.shape_factories.Shape;


public class Circle implements Shape {


    protected int radius;

    public Circle(int r) {
        radius = r;
    }

    @Override
    public void draw()
    {

    }

}
