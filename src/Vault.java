
public class Vault {
int code;
	Vault(int code){
		this.code=code;
	}
	boolean tryCode(int guess){
		if(guess==code) {
			return true;
		}
		else{
			return false;
		}
	
	}

