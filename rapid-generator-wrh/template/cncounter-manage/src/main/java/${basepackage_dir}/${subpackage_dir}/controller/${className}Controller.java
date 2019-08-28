<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ${basepackage}.${subpackage}.model.${className};
import ${basepackage}.${subpackage}.service.${className}Service;
import ${basepackage}.${subpackage}.exception.ResultUtils;
/**
 * @version 1.0
 * @author wrh
 */
@RestController
@RequestMapping("/${subpackage}/${classNameLower}")
@Validated
public class ${className}Controller{
    
    @Autowired
    private ${className}Service ${classNameLower}Service;
    
	@RequestMapping(value = "/list.json")
	@ResponseBody
	public Object list(HttpServletRequest request,${className} ${classNameLower}) {
		PageHelper.startPage(${classNameLower}.getPage(), ${classNameLower}.getLimit());
		List<${className}> list = ${classNameLower}Service.listPage(${classNameLower});
		PageInfo<${className}> pageInfo = new PageInfo<${className}>(list);
		return ResultUtils.successlist(list,pageInfo.getTotal());
	}

	@RequestMapping(value = "/add.json", method = RequestMethod.POST)
	public Object doAdd(HttpServletRequest request,${className} ${classNameLower}) {
		int num = ${classNameLower}Service.add(${classNameLower});
		if(num>0) {
			return ResultUtils.success("");
		}
		return ResultUtils.fail("");
	}
	

	@RequestMapping(value = "/edit.json", method = RequestMethod.POST)
	public Object doEdit(HttpServletRequest request,${className} ${classNameLower}) {
		int num = ${classNameLower}Service.update(${classNameLower});
		if(num>0) {
			return ResultUtils.success("");
		}
		return ResultUtils.fail("");
	}
	

	@RequestMapping(value = "/delete.json", method = RequestMethod.POST)
	public Object delete(HttpServletRequest request,int id) {
		int num = ${classNameLower}Service.delete(id);
		if(num>0) {
			return ResultUtils.success("");
		}
		return ResultUtils.fail("");
	}

}
