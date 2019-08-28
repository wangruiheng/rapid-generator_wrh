<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ${basepackage}.${subpackage}.service.${className}Service;
import ${basepackage}.${subpackage}.model.${className};
import ${basepackage}.${subpackage}.dao.mysql.${className}Mapper;

/**
 * @version 1.0
 * @author wrh
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ${className}ServiceImpl implements ${className}Service {
	
    @Autowired private ${className}Mapper ${classNameLower}Mapper;
    
	public int add(${className} ${classNameLower}) {
		if(null == ${classNameLower}){
			return 0;
		}
        int rows = ${classNameLower}Mapper.insert(${classNameLower});
        return rows;
	}

    
    public int update(${className} ${classNameLower}) {
		if(null == ${classNameLower}){
			return 0;
		}
        int rows = ${classNameLower}Mapper.update(${classNameLower});
        return rows;
    }
    
    
    public int delete(Integer id) {
		if(null == id){
			return 0;
		}
        int rows = ${classNameLower}Mapper.deleteById(id);
        return rows;
    }
    
    
    public ${className} getById(Integer id) {
		if(null == id){
			return null;
		}
		${className} ${classNameLower} = ${classNameLower}Mapper.getById(id);
        return ${classNameLower};
    }
    
	public List<${className}> listPage(${className} ${classNameLower}){
		List<${className}> lists = ${classNameLower}Mapper.listPage(${classNameLower});
		return lists;
	}
}
