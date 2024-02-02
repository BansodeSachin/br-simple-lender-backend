/**
 * 
 */
package com.sachin.springdemo.payload.request;

import java.io.Serializable;

/**
 * @author Dheeraj
 *
 */
public class SubCategoryRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6680694443932380421L;
	
	private Long subCategoryId;

	private String subCategoryName;

	private String subCategoryCode;

	private Long categoryId;

	private String isDeleted;

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getSubCategoryCode() {
		return subCategoryCode;
	}

	public void setSubCategoryCode(String subCategoryCode) {
		this.subCategoryCode = subCategoryCode;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubCategoryRequest [subCategoryId=").append(subCategoryId).append(", subCategoryName=")
				.append(subCategoryName).append(", subCategoryCode=").append(subCategoryCode).append(", categoryId=")
				.append(categoryId).append(", isDeleted=").append(isDeleted).append("]");
		return builder.toString();
	}

}
