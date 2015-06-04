package selenium_testing_tools_cookbook_gundecha.ch04.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *  This class tests the BMI Calculation page
 *
 *  Using test data from an internal object
 */

@RunWith(value = Parameterized.class)
public class BmiCalculatorPageTestUsingDataSet extends BaseTestSetup {

    private String height;
    private String weight;
    private String bmi;
    private String bmiCategory;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new  Object[][]{
                {"160","45","17.6","Underweight"},
                {"168","70","24.8","Normal"},
                {"181","89","27.2","Overweight"},
                {"178","100","31.6","Obesity"}
        };
        return Arrays.asList(data);
    }

    public BmiCalculatorPageTestUsingDataSet (String height, String weight, String bmi, String bmiCategory) {
        this.height = height;
        this.weight =  weight;
        this.bmi = bmi;
        this.bmiCategory =  bmiCategory;
    }

    @Test
    public void testBMICalculator() throws Exception {

        BmiCalculatorPage bmiCalc;
        bmiCalc = new BmiCalculatorPage(driver);

        try {
            bmiCalc.calculateBmi(height, weight);

            // check value for calculated BMI
            String bmiCalculated = bmiCalc.getCalculatedBmiFromPage();
            assertThat(bmiCalculated, equalTo(bmi));

            // check value for calculated BMI Category
            String bmiCategoryCalculated = bmiCalc.getCalculatedBmiCategoryFromPage();
            assertThat(bmiCategoryCalculated, equalTo(bmiCategory));

        } catch (Error e) {
            //Capture and append Exceptions/Errors
            verificationErrors.append(e.toString());
            System.err.println("Assertion Fail " + verificationErrors.toString());
        }
    }
}
