
public class Vault {
	int code;

	Vault(int code) {
		this.code = code;
	}

	boolean tryCode(int guess) {
		if (guess == code) {
			return true;
		} else {
			return false;
		}

	}
	public static void main(String[] args) {
		JamesBond bond=new JamesBond();
		int answer=bond.findCode();
		System.out.println(answer);
	}
}
