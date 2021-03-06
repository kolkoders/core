package org.iq.gen.test;

import org.iq.gen.Generator;

public class TestGenerator {

	private static String plansDir = "D:/projects/git/core/res/setup/files/dev/plans";
	private static String[] moduleNames = new String[] { "apt" };
	private static String destDir = "D:/projects/eclipseworkspace/new-test";
	private static String packagePrefix = "com.iq.test.app";

	public static void main(String[] args) throws Exception {
		Generator codeGenerator = new Generator(plansDir, moduleNames, destDir, packagePrefix);
		codeGenerator.generate();
	}
}