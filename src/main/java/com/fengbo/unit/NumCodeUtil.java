package com.fengbo.unit;

import java.util.Random;
import java.util.UUID;

public class NumCodeUtil {

	/**
	 * 生成随机码值，
	 * 生成ID值，
	 * 只包含数字
	 * 
	 * 
	 */
	public static String getRandomCode(int number) {
		String codeNum = "";
		int[] code = new int[number];
		Random random = new Random();
		for (int i = 0; i < code.length; i++) {
			int num = random.nextInt(9) + 1;
			code[i] = num;
			
			codeNum += code[i];
		}
		return codeNum;
	}
	
	public static void main(String[] args) {
		getRandomCode(6);

	}

}
