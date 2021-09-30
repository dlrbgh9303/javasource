package interfaceTest;

public class Television implements RemoteControl,Searchable {
	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		
		if (volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		}else if (volume <RemoteControl.MIN_VOLUME) {
			volume  = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재볼륨 : " +volume);

			
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}
	
		

}
