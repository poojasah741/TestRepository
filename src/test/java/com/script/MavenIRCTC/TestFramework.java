package com.script.MavenIRCTC;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.MavenIRCTC.BaseTest;
import com.pages.MavenIRCTC.POMFramework;


public class TestFramework extends BaseTest{
	@Test
	public void irctcreg() throws InterruptedException, IOException {
		POMFramework ir=new POMFramework(driver);
		ir.irctcMethod();
	}

}
