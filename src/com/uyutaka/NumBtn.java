package com.uyutaka;

/**
 * Created by Yutaka on 15/05/03.
 */
public class NumBtn extends BtnMain {

    private int [] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public NumBtn(){
        for(int i = 0; i < 10; i++){
            System.out.println(nums[i]);
        }
    }
}
