package com.company;

import java.util.Objects;

public class Pentagon extends Figure {
    protected final int a, b, c;

    public Pentagon(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return a + b + c;
    }               //С формулой площади пятиугольника все слишком плохо)))

    @Override
    public String toString() {
        return "Pentagon{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pentagon pentagon = (Pentagon) o;
        return a == pentagon.a &&
                b == pentagon.b &&
                c == pentagon.c;
    }
}