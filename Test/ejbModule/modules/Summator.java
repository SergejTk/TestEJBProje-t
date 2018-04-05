package modules;

import javax.ejb.Stateless;

@Stateless
public class Summator {
	public int addTwoNumbers(int arg1, int arg2) {
		return arg1 + arg2;
	}

}
