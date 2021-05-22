package com.cts.handson4.facade;

import com.cts.handson4.facade.interfaces.Shape;
import com.cts.handson4.facade.interfaces.impl.Circle;
import com.cts.handson4.facade.interfaces.impl.Rectangle;
import com.cts.handson4.facade.interfaces.impl.Square;

/*
    Facade to hide Shape creation complexity
 */

public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawRectangle() {
        this.rectangle.draw();
    }

    public void drawSquare() {
        this.square.draw();
    }
}
