<#include "/macro.include"/>
package ${basepackage}.${subpackage}.model;
/**
 * @version 1.0
 * @author wrh
 */
public class PageInfo {
	
	private int page = 1;
	
	private int limit = 5;

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	
}
