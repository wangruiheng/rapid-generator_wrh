<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.dao.mysql;

import java.util.List;

import org.springframework.stereotype.Repository;

import ${basepackage}.${subpackage}.model.${className};

@Repository
public interface ${className}Mapper {
    
    ${className} getById(Integer id);

    List<${className}> listPage(${className} ${classNameLower});
    
    int insert(${className} ${classNameLower});
    
    int update(${className} ${classNameLower});
    
    int deleteById(Integer id);
}