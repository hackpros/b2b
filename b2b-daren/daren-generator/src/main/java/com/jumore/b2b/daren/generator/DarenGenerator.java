package com.jumore.b2b.daren.generator;

import org.mybatis.generator.api.ShellRunner;

public class DarenGenerator {
public static void main(String[] args) {
		
		String config = DarenGenerator.class.getResource("/daren.xml").getFile();
		//String config = MsqlStartTest.class.getResource("/mysql_base.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}
}
