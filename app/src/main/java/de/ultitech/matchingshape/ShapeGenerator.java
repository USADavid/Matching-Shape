package de.ultitech.matchingshape;

/**
 * Created by davidgreiner on 1/20/15.
 */
public class ShapeGenerator {
    Shape cross = new Shape(new int[][]{
            {255,0,0,0,0,0,0,0,0,0,0,255},
            {0,255,0,0,0,0,0,0,0,0,255,0},
            {0,0,255,0,0,0,0,0,0,255,0,0},
            {0,0,0,255,0,0,0,0,255,0,0,0},
            {0,0,0,0,255,0,0,255,0,0,0,0},
            {0,0,0,0,0,255,255,0,0,0,0,0},
            {0,0,0,0,0,255,255,0,0,0,0,0},
            {0,0,0,0,255,0,0,255,0,0,0,0},
            {0,0,0,255,0,0,0,0,255,0,0,0},
            {0,0,255,0,0,0,0,0,0,255,0,0},
            {0,255,0,0,0,0,0,0,0,0,255,0},
            {255,0,0,0,0,0,0,0,0,0,0,255}
    });
    Shape triangle = new Shape(new int[][]{
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,255,255,0,0,0,0,0},
            {0,0,0,0,255,0,0,255,0,0,0,0},
            {0,0,0,255,0,0,0,0,255,0,0,0},
            {0,0,255,0,0,0,0,0,0,255,0,0},
            {0,255,0,0,0,0,0,0,0,0,255,0},
            {255,255,255,255,255,255,255,255,255,255,255,255},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0}
    });

    Shape generateCross()
    {
        return cross;
    }

    Shape generateTriangle()
    {
        return triangle;
    }
}