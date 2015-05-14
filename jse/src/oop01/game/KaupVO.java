package oop01.game;

public class KaupVO {
	private double height, weight;
	private int idx;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {

		if (idx > 30) {
			msg = "��";
		} else if (idx > 24) {
			msg = "��ü��";
		} else if (idx > 20) {
			msg = "����";
		} else if (idx > 15) {
			msg = "��ü��";
		} else if (idx > 13) {
			msg = "����";
		} else if (idx > 10) {
			msg = "�������";
		} else {
			msg = "�Ҹ���";
		}

		this.msg =msg;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx() {

		this.idx = (int) ((weight / (height * height)) * 10000);
	}

	public String toString() {
		
		return  "ī�������� : Ű = "+getHeight()
				+", ������ = "+getWeight()
				+", idx = "+getIdx()+" "+getMsg();
	}
}
