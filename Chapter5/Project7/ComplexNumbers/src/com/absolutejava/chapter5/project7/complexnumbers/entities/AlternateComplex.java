/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.absolutejava.chapter5.project7.complexnumbers.entities;

/**
 *
 * @author Kashif Ahmed Khan
 */
public class AlternateComplex {

    private double real;
    private double imaginary;

    public AlternateComplex() {
        this(0.0);
    }

    public AlternateComplex(double d) {
        this(d, 0.0);
    }

    public AlternateComplex(double real, double imaginary) {
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

    public void add(AlternateComplex other) {
        this.setReal(this.getReal() + other.getReal());
        this.setImaginary(this.getImaginary() + other.getImaginary());
    }

    public void subtract(AlternateComplex other) {
        this.setReal(this.getReal() - other.getReal());
        this.setImaginary(this.getImaginary() - other.getImaginary());
    }

    public void multiply(AlternateComplex other) {
        double tempReal = calculateRealForMultiplication(this, other);
        double tempImaginary = calculateImaginaryForMultiplication(this, other);
        this.setReal(tempReal);
        this.setImaginary(tempImaginary);
    }

    private double calculateRealForMultiplication(AlternateComplex c1, AlternateComplex c2) {
        return (c1.getReal() * c2.getReal()) - (c1.getImaginary() * c2.getImaginary());
    }

    private double calculateImaginaryForMultiplication(AlternateComplex c1, AlternateComplex c2) {
        return (c1.getReal() * c2.getImaginary()) + (c1.getImaginary() * c2.getReal());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.real) ^ (Double.doubleToLongBits(this.real) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.imaginary) ^ (Double.doubleToLongBits(this.imaginary) >>> 32));
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
        final AlternateComplex other = (AlternateComplex) obj;
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
