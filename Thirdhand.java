package com.company;

public class Thirdhand {
    public static void main(String[] args) {
    Matrix.fundamental=new double[][] {{1.11,2.22,3.33},{4.44,5.55,6.66},{7.77,8.88,9.99}};
    Matrix matrix=new Matrix(new double[][]{{1.23,2.45,3.123},{1.123,2.123,2.333},{1.123,2.543,3.565}},3,3);
    System.out.println("Сложив матрицу с основной,получим:");
    matrix.print();
    matrix.plus();
    matrix.multiplic(6);
    }
}
class Matrix {
    private double[][] array ;
    static double[][] fundamental;
    int m;
    int n;

    Matrix(double[][] array, int m, int n) {
        this.array = array;
        this.m = m;
        this.n = n;
    }

    void print() {
        System.out.println("Вывод исходной матрицы");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void plus() {
        if ((m == 3) && (n == 3)) {
            for (int i = 0; i < fundamental.length; i++) {
                for (int j = 0; j < fundamental[i].length; j++) {
                    array[i][j] += fundamental[i][j];
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    void multiplic(int k) {
        System.out.println("Умножая исходную матрицу на " + k + " получим:");
        for (int i = 0; i < fundamental.length; i++) {
            for (int j = 0; j < fundamental[i].length; j++) {
                array[i][j] *= k;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

