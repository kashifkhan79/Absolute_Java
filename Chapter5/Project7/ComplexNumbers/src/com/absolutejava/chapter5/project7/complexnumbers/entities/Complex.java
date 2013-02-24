/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project7.complexnumbers.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class Complex {

    private double real;
    private double imaginary;

    public Complex() {
        this(0.0);
    }

    public Complex(double real) {
        this(real, 0.0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public static Complex add(Complex c1, Complex c2) {
        double real = c1.getReal() + c2.getReal();
        double imaginary = c1.getImaginary() + c2.getImaginary();
        return new Complex(real, imaginary);
    }

    public Complex add(Complex other) {
        double localReal = this.getReal() + other.getReal();
        double localImaginary = this.getImaginary() + other.getImaginary();
        return new Complex(localReal, localImaginary);
    }

    public static Complex subtract(Complex c1, Complex c2) {
        double real = c1.getReal() - c2.getReal();
        double imaginary = c1.getImaginary() - c2.getImaginary();
        return new Complex(real, imaginary);
    }

    public Complex subtract(Complex other) {
        double localReal = this.getReal() - other.getReal();
        double localImaginary = this.getImaginary() - other.getImaginary();
        return new Complex(localReal, localImaginary);
    }

    public static Complex multiply(Complex c1, Complex c2) {
        double real = calculateRealForMultiplication(c1, c2);
        double imaginary = calculateImaginaryForMultiplication(c1, c2);
        return new Complex(real, imaginary);
    }

    public Complex multiply(Complex other) {
        double localReal = calculateRealForMultiplication(this, other);
        double localImginary = calculateImaginaryForMultiplication(this, other);
        return new Complex(localReal, localImginary);
    }

    private static double calculateRealForMultiplication(Complex c1, Complex c2) {
        return (c1.getReal() * c2.getReal()) - (c1.getImaginary() * c2.getImaginary());
    }

    private static double calculateImaginaryForMultiplication(Complex c1, Complex c2) {
        return (c1.getReal() * c2.getImaginary()) + (c1.getImaginary() * c2.getReal());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.real) ^ (Double.doubleToLongBits(this.real) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.imaginary) ^ (Double.doubleToLongBits(this.imaginary) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complex other = (Complex) obj;
        if (Double.doubleToLongBits(this.real) != Double.doubleToLongBits(other.real)) {
            return false;
        }
        if (Double.doubleToLongBits(this.imaginary) != Double.doubleToLongBits(other.imaginary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getReal() + " + " + this.getImaginary() + "i";
    }
}
