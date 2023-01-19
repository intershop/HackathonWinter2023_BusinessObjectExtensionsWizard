package ${basePkg}.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import ${basePkg}.capi.${extendedBusinessObject}${extensionName}Extension;

@RunWith(MockitoJUnitRunner.class)
public class ${extendedBusinessObject}${extensionName}ExtensionImplTest
{
    private static final String EXTENSION_ID = "${extensionId}";

    @Test
    public void extensionIdTest()
    {
        assertEquals(EXTENSION_ID, ${extendedBusinessObject}${extensionName}Extension.EXTENSION_ID);
    }
}