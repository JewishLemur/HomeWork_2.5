package com.company;

import java.util.Objects;

public class Trapezium extends Figure {

    protected final int a, b, h;

    public Trapezium(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return (a + b) / 2 * h;
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, h);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trapezium trapezium = (Trapezium) o;
        return a == trapezium.a &&
                b == trapezium.b &&
                h == trapezium.h;
    }
}
