package seleniumTestingToolsCookbookGundecha.ch04.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *  This utility pulls in data from a CSV file
 *
 *  Ref: The Selenium Testing Tools Cookbook (chapter 4) by Unmesh Gundecha
 */

public class LoadDataFromCsvFile {

    public static Collection<String[]> getTestData(String fileName) throws IOException {
        List<String[]> records = new ArrayList<String[]>();
        String record;

        BufferedReader file = new BufferedReader(new FileReader(fileName));
        while ((record=file.readLine())!=null) {
            String fields[] = record.split(",");
            records.add(fields);
        }
        file.close();
        return records;
    }
}

