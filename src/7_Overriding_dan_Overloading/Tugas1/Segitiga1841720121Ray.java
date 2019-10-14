/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Segitiga1841720121Ray {
    private int mSudut;
    private int mKeliling;

    public int totalSudutRay(int sudutA) {
        mSudut = 180 - sudutA;
        return mSudut;
    }

    public int totalSudutRay(int sudutA, int sudutB) {
        mSudut = 180 - (sudutA + sudutB);
        return mSudut;
    }

    public int kelilingRay(int sudutA, int sudutB, int sudutC) {
        mKeliling = sudutA + sudutB + sudutC;
        return mKeliling;
    }

    public double kelilingRay(int sudutA, int sudutB) {
        double sudutC = Math.sqrt(Math.pow(sudutA, 2) + Math.pow(sudutB, 2));
        double mKeliling = sudutA + sudutB + sudutC;
        return mKeliling;
    }

    public static void main(String[] args) {
        Segitiga1841720121Ray sgt = new Segitiga1841720121Ray();
        System.out.println(sgt.kelilingRay(2, 3));
        System.out.println(sgt.kelilingRay(2, 3, 4));
        
        System.out.println(sgt.totalSudutRay(90));
        System.out.println(sgt.totalSudutRay(90, 60));

    }
}