package com.ibm.core.java.Day3.Practice;

@FunctionalInterface
public interface FuncInterface {
	
	public abstract int addSum(int a,int b);
	
	
	//public int subNum(int a , int b);

}

class CalcMethod implements FuncInterface{
	
	
	@Override
	public int addSum(int a,int b) {
		return a+b;
	}
	
//	@Override
//	public int subNum(int a,int b) {
//		return a-b;
//	}
}
