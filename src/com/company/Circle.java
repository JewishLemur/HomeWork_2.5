package com.company;

import java.util.Objects;

public class Circle extends Figure {

    protected final int r , pi;

    public Circle(int r, int pi) {
        this.r = r;
        this.pi = pi;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return r * r * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", pi=" + pi +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(r,pi);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r == circle.r &&
                pi == circle.pi;
    }
}


