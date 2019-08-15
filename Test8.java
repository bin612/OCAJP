package ocjpjava;

import java.io.IOException;

class X{
	public void priintFileContent() {
		/* code goes here */
		throw new IOException();
	}
}

public class Test8 {
	public static void main(String[] args) {
		X xobj = new X();
		xobj.printFileContent();

	}

}
