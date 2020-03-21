package test;

/*
 * "construct a complex object from simple objects using step-by-step approach"
 */
public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CDBuilder cdBuilder = new CDBuilder();
		CDType samsungCd = cdBuilder.buildSamsungCD();
		samsungCd.showItems();

		CDType sonyCd = cdBuilder.buildSonyCD();
		sonyCd.showItems();

	}

}
