package oop05.polymorphism;

public class OrangeImp implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s+"������ �Դϴ�.");
	}
	public int getCount(){
		return 1000;
	}
	
}
