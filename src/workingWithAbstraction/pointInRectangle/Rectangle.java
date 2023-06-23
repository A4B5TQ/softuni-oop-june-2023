package workingWithAbstraction.pointInRectangle;

import java.awt.*;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        boolean isXBasedInside = this.getBottomLeft().getX()<= point.getX() &&
                this.topRight.getX() >= point.getX();
        boolean isYBasedInside = this.getBottomLeft().getY()<= point.getY() &&
                this.topRight.getY() >= point.getY();

        return isXBasedInside && isYBasedInside;
    }
}
