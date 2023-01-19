package ${basePkg}.capi;

import com.intershop.beehive.businessobject.capi.BusinessObjectExtension;
import ${extendedBusinessObjectPkg}.${extendedBusinessObject};

public interface ${extendedBusinessObject}${extensionName}Extension extends BusinessObjectExtension<${extendedBusinessObject}>
{
	public static final String EXTENSION_ID = "${extensionId}";
}