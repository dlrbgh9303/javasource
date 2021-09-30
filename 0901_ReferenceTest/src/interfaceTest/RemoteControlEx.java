package interfaceTest;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
//		rc.turnOn();
//		rc.setVolume(7);
//		rc.turnOff();
		
		//익명 구현 객체
		RemoteControl rc1 = new RemoteControl() {
			
			private int volume;

			@Override
			public void turnOn() {
				System.out.println("Radio를 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Radio를 켭니다");
				
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
				System.out.println("Radio 현재볼륨 : " +volume);

			}
		};
				rc1.turnOn();
				rc1.setVolume(5);
				rc1.turnOff();
		
	}

}
