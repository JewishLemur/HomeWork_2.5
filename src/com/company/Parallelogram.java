package com.company;

import java.util.Objects;

public class Parallelogram extends Figure {

    protected int a;
    protected int h;

    public Parallelogram(int a, int h) {
        this.a = a;
        this.h = h;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }


    @Override
    public double getArea() {
        return a * h;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return a == that.a &&
                h == that.h;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, h);


    }

}



