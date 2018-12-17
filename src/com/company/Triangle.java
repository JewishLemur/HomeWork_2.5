package com.company;

import java.util.Objects;

public class Triangle extends Figure {
    protected final int x, y, z, h, a;

    public Triangle(int x, int y, int z, int h, int a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.h = h;
        this.a = a;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public double getPerimeter() {
        return x + z + y;
    }

    @Override
    public double getArea() {
        return a/2 * h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", h=" + h +
                ", a=" + a +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(x,y,z,h,a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return x == triangle.x &&
                y == triangle.y &&
                z == triangle.z &&
                h == triangle.h &&
                a == triangle.a;
    }
}