package hu.marthon_szabo.file_part_reader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({FilePartReaderTest.class, ReadLineTest.class, SubstringTest.class})
public class FeatureUnitTest {
    Object[] classes = {FilePartReaderTest.class, ReadLineTest.class, SubstringTest.class};

    public void runThrough() {
        Result result = JUnitCore.runClasses(FilePartReaderTest.class, ReadLineTest.class, SubstringTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
