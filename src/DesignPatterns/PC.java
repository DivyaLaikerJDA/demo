package DesignPatterns;

public class PC  extends Computers{

	private String ram;
	private String hdd;
	private String cpu;
	public PC(String ram,String hdd,String cpu)
	{
		this.ram  = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
