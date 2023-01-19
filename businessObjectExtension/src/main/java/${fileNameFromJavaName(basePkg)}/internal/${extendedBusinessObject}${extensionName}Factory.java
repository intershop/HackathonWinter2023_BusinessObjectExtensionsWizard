package ${basePkg}.internal;

import com.intershop.beehive.businessobject.capi.AbstractBusinessObjectExtensionFactory;
import com.intershop.beehive.businessobject.capi.BusinessObjectExtension;
import ${extendedBusinessObjectPkg}.${extendedBusinessObject};
import ${basePkg}.capi.${extendedBusinessObject}${extensionName}Extension;

public class ${extendedBusinessObject}${extensionName}Factory extends AbstractBusinessObjectExtensionFactory<${extendedBusinessObject}>
{
    @Override
    public BusinessObjectExtension<${extendedBusinessObject}> createExtension(${extendedBusinessObject} extendedObject)
    {
        return new ${extendedBusinessObject}${extensionName}ExtensionImpl(${extendedBusinessObject}${extensionName}Extension.EXTENSION_ID, extendedObject);
    }

    @Override
    public Class<${extendedBusinessObject}> getExtendedType()
    {
        return ${extendedBusinessObject}.class;
    }
}