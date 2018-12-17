package com.company;

import java.util.Objects;

public final class Square extends Figure {
    private final int x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    public double getPerimeter() {
        return 4 * x;
    }

    @Override
    public double getArea() {
        return x * x;
    }


    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash (x);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return x == square.x;
    }
}