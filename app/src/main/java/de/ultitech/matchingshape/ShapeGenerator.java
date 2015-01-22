package de.ultitech.matchingshape;

/**
 * Created by davidgreiner on 1/20/15.
 */
public class ShapeGenerator {
    Shape generateCross()
    {
        return new Shape(new int[][]{
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
    }

    Shape generateTriangle()
    {
        return new Shape(new int[][]{
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
    }

    Shape generateT()
    {
        return new Shape(new int[][]{
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,0,0,0,0,255,255,0,0,0,0,0},
                {0,0,0,0,0,255,255,0,0,0,0,0},
                {0,0,0,0,0,255,255,0,0,0,0,0},
                {0,0,0,0,0,255,255,0,0,0,0,0},
                {0,0,0,0,0,255,255,0,0,0,0,0},
                {0,0,0,0,0,255,255,0,0,0,0,0},
                {0,0,0,0,0,255,255,0,0,0,0,0},
                {0,0,0,0,0,255,255,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0}
        });
    }

    Shape generateE()
    {
        return new Shape(new int[][]{
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,255,255,255,255,255,255,0,0,0},
                {0,0,0,255,255,255,255,255,255,0,0,0},
                {0,0,0,255,255,0,0,0,0,0,0,0},
                {0,0,0,255,255,0,0,0,0,0,0,0},
                {0,0,0,255,255,255,255,255,255,0,0,0},
                {0,0,0,255,255,255,255,255,255,0,0,0},
                {0,0,0,255,255,0,0,0,0,0,0,0},
                {0,0,0,255,255,0,0,0,0,0,0,0},
                {0,0,0,255,255,255,255,255,255,0,0,0},
                {0,0,0,255,255,255,255,255,255,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0}
        });
    }

    Shape generateC()
    {
        return new Shape(new int[][]{
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,255,255,0,0,0,0,0,0,0,0,0},
                {0,255,255,0,0,0,0,0,0,0,0,0},
                {0,255,255,0,0,0,0,0,0,0,0,0},
                {0,255,255,0,0,0,0,0,0,0,0,0},
                {0,255,255,0,0,0,0,0,0,0,0,0},
                {0,255,255,0,0,0,0,0,0,0,0,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,0,0,0,0,0,0,0,0,0,0,0}
        });
    }

    Shape generateO()
    {
        return new Shape(new int[][]{
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,255,255,0,0,0,0,0,0,255,255,0},
                {0,255,255,0,0,0,0,0,0,255,255,0},
                {0,255,255,0,0,0,0,0,0,255,255,0},
                {0,255,255,0,0,0,0,0,0,255,255,0},
                {0,255,255,0,0,0,0,0,0,255,255,0},
                {0,255,255,0,0,0,0,0,0,255,255,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,255,255,255,255,255,255,255,255,255,255,0},
                {0,0,0,0,0,0,0,0,0,0,0,0}
        });
    }
}
