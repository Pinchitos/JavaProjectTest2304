package Model;

public class Computer {
	
	private String gpu;
	private int ram;
	private String cpu;
	private String motherBoard;
	private int hddCapacity;
	
	
	public Computer() {
		super();
	}

	public Computer(String gpu, int ram, String cpu, String motherBoard, int hddCapacity) {
		super();
		this.gpu = gpu;
		this.ram = ram;
		this.cpu = cpu;
		this.motherBoard = motherBoard;
		this.hddCapacity = hddCapacity;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
	}

	public int getHddCapacity() {
		return hddCapacity;
	}

	public void setHddCapacity(int hddCapacity) {
		this.hddCapacity = hddCapacity;
	}
	
	@Override
	public String toString() {
		return "Computer [gpu=" + gpu + ", ram=" + ram + ", cpu=" + cpu + ", motherBoard=" + motherBoard
				+ ", hddCapacity=" + hddCapacity + "]";
	}
	
	
	
}
