<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.${subpackage}.vo;

import java.util.Date;
import ${basepackage}.${subpackage}.utils.DateUtils;
/**
 * ${table.tableAlias}
 * @version 1.0
 * @author wrh
 */
public class ${className}{

	<#list table.columns as column>
	<#if column.simpleJavaType != "Date">
	private ${column.simpleJavaType} ${column.columnNameLower};
	</#if>
	<#if column.simpleJavaType == "Date">
	private String ${column.columnNameLower};
	</#if>
	
	</#list>
		
	<#list table.columns as column>
	<#if column.simpleJavaType != "Date">  
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#if> 
	<#if column.simpleJavaType == "Date">  
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = DateUtils.getDateToString(value, "yyyy-MM-dd HH:mm:ss");
	}
	
	public String get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#if>
	</#list>
}
