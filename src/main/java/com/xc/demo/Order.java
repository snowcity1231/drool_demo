package com.xc.demo;

/** 
* @ClassName: Order 
* @Description: 实体类
* @author xuechen
* @date 2016年12月30日 上午10:45:32 
*  
*/
public class Order {

	private String name;
	private Integer sumprice;
	private Integer discountPercent;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sumprice
	 */
	public Integer getSumprice() {
		return sumprice;
	}
	/**
	 * @param sumprice the sumprice to set
	 */
	public void setSumprice(Integer sumprice) {
		this.sumprice = sumprice;
	}
	/**
	 * @return the discountPercent
	 */
	public Integer getDiscountPercent() {
		return discountPercent;
	}
	/**
	 * @param discountPercent the discountPercent to set
	 */
	public void setDiscountPercent(Integer discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	
}
