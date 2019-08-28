<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.service;

import java.util.List;

import ${basepackage}.${subpackage}.model.${className};

/**
 * @version 1.0
 * @author wrh
 */
public interface ${className}Service {
	
	public int add(${className} ${classNameLower});

	public int update(${className} ${classNameLower});
    
	public int delete(Integer id);

	public ${className} getById(Integer id);

	public List<${className}> listPage(${className} ${classNameLower});

}
