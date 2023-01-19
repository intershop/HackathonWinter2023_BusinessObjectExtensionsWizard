package ${basePkg}.internal;

import com.intershop.beehive.businessobject.capi.AbstractBusinessObjectExtension;
import ${extendedBusinessObjectPkg}.${extendedBusinessObject};
import ${basePkg}.capi.${extendedBusinessObject}${extensionName}Extension;

public class ${extendedBusinessObject}${extensionName}ExtensionImpl extends AbstractBusinessObjectExtension<${extendedBusinessObject}> implements ${extendedBusinessObject}${extensionName}Extension
{
    public ${extendedBusinessObject}${extensionName}ExtensionImpl(String extensionID, ${extendedBusinessObject} extendedObject)
    {
        super(extensionID, extendedObject);
    }
}