package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object validEmail
     
    /**
     * <p></p>
     */
    public static Object validPassword
     
    /**
     * <p></p>
     */
    public static Object invalidEmail
     
    /**
     * <p></p>
     */
    public static Object invalidPassword
     
    /**
     * <p></p>
     */
    public static Object name
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            validEmail = selectedVariables['validEmail']
            validPassword = selectedVariables['validPassword']
            invalidEmail = selectedVariables['invalidEmail']
            invalidPassword = selectedVariables['invalidPassword']
            name = selectedVariables['name']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
