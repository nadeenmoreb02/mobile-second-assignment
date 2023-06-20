package com.example.myapplication;

public class Alphabet {
    private String alphabet;
    private int imgId;

    public Alphabet(String alphabet, int imgId) {
        this.alphabet = alphabet;
        this.imgId = imgId;
    }
   /* Alphabet[] alphabets = {

            new Alphabet("A", R.drawable.image_a),
            new Alphabet("B", R.drawable.image_b),
            new Alphabet("C", R.drawable.image_c),
            new Alphabet("D", R.drawable.image_d),
            new Alphabet("E", R.drawable.image_e),
            new Alphabet("F", R.drawable.image_f),
            new Alphabet("G", R.drawable.image_g),
            new Alphabet("H", R.drawable.image_h),
            new Alphabet("I", R.drawable.image_i),
            new Alphabet("J", R.drawable.image_j),
            new Alphabet("K", R.drawable.image_k),
            new Alphabet("L", R.drawable.image_l),
            new Alphabet("M", R.drawable.image_m),
            new Alphabet("N", R.drawable.image_n),
            new Alphabet("O", R.drawable.image_o),
            new Alphabet("P", R.drawable.image_p),
            new Alphabet("Q", R.drawable.image_q),
            new Alphabet("R", R.drawable.image_r),
            new Alphabet("S", R.drawable.image_s),
            new Alphabet("T", R.drawable.image_t),
            new Alphabet("U", R.drawable.image_u),
            new Alphabet("V", R.drawable.image_v),
            new Alphabet("W", R.drawable.image_w),
            new Alphabet("X", R.drawable.image_x),
            new Alphabet("Y", R.drawable.image_y),
            new Alphabet("Z", R.drawable.image_z)
    };
*/


    public String getAlphabet() {
        return alphabet;
    }

    public int getImgId() {
        return imgId;
    }

    /*public Alphabet[] getAlphabets() {
        return alphabets;
    }*/
}
