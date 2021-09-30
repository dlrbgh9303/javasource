package inheritance;

public class CellPhoneEx  {

	public static void main(String[] args) {
		CellPhoneDMB phone = new CellPhoneDMB();
		
		
		
		
		phone.color="black";
		phone.model="자바폰";
		phone.channel=7;
		
		phone.powerOn();
		phone.turnOnDmb();
		phone.changeChannelDmb(8);
		phone.bell();
		phone.sendVoice("안녕하세요");
		phone.receiveVoice("반가워요");
		phone.hangUp();
		
	}

}
