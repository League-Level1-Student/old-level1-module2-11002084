
public class JamesBond {
	Vault vault = new Vault(90921);

	int findCode() {
		for (int i = 0; i < 1000000; i++) {
			if (vault.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
