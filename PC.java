package Domasna3;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int hardDisk;
	public String golemina = "GB";
	public String disk;
	public String ssd;
	
	public PC () {
		this.memorija = 2;
		this.tipNaMemorija = "DDR4";
		this.hardDisk = 160;
		this.disk = "HDD";
		this.ssd = "SSD m.2";
	}

	public void prvMetod (int ZgolemiMemorija, int novSSDDisk)
	{
		System.out.println("Memorijata bese " + this.memorija + golemina + ", sega iznesuva " + (ZgolemiMemorija + memorija) + golemina + ".");
		System.out.println("Tipot na memorijata e " + this.tipNaMemorija + ".");
		System.out.println("Noviot disk e " + this.ssd + " ima golemina od " + novSSDDisk + golemina + ". Prethodno imase " + this.disk + ", i iznesuvase " + this.hardDisk + golemina + ".");

	}

}
