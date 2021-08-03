package com.everis.tests;

import org.junit.ClassRule;
import org.junit.runner.RunWith;

import com.everis.util.TestRule;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@android", glue = {
		"" }, monochrome = true, dryRun = false, plugin = { "json:target/cucumber.json", "rerun:target/rerun.txt" })
public class AndroidTest {

	@ClassRule
	public static TestRule testRule = new TestRule();
}