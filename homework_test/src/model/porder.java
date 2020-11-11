package model;

public class porder {
	private String name;
	private int ruler;
	private int pen;
	private int sum;
	private String date;
	
	public porder(String name,int ruler,int pen) {
		
		this.name=name;
		this.ruler=ruler;
		this.pen=pen;
		//sum=ruler*20+pen*15;
		
	}

	public porder() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getRuler() {
		return ruler;
	}
	public void setRuler(int ruler) {
		this.ruler=ruler;
	}
	
	public int getPen() {
		return pen;
	}
	public void setPen(int pen) {
		this.pen=pen;
	}
	
	public int getSum() {
		sum=ruler*20+pen*15;
		return sum;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
