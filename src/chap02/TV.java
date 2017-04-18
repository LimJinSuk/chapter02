package chap02;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	//채널 로테이션 
	public TV(int channel,int volume, boolean power){
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on){
		if(power==false)
			power=true;
		else
			power=false;
	}
	public void channel( int channel ) {
		this.channel=channel;
		if(channel>255)
			this.channel=channel-255;
		else if(channel<1)
			this.channel=channel+255;		
	}
	
	public void channel( boolean up ) {
		if(up==true){
			channel++;
			if(channel>255)
				channel=channel-255;
		}
		else{
			channel--;
			if(channel<1)
				channel=channel+255;
		}
	}
	
	public void volume( int voluem ) {
		this.volume=voluem;
		if(volume>100)
			volume=100;
		else if(volume<0)
			volume=0;
	}
	
	public void volume( boolean up ){
		if(up== true){	
			volume++;
			if(volume>100)
				volume=100;
		}
		else{
			volume--;
			if(volume<0)
				volume=0;
		}
		
	}
	public void status() {
		System.out.println("TV [channel="+channel+", volume="+volume+", power="+power+"]");
	}
	
}
