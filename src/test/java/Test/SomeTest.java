package Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
                 tags = "@User2",
                 glue = "Steps",
                 dryRun = false,
                 plugin = {"html:CucumberReports", "junit:CucumberReports/JunitReport.xml",
                            "usage:CucumberReports/UsageReport.json",
                             "pretty:CucumberReports/PrettyReport.txt"}
)

public class SomeTest {
}
