package com.openlab.util;

import java.util.List;

public class PageGoods<Goods> {
	private int totalSize;
	private int pageSize;
	private int currentPage;
	private List<Goods> glist;

	public PageGoods() {
		super();
	}

	public int getPageTotal() {
		if (totalSize % pageSize == 0) {
			return totalSize / pageSize;
		} else {
			return (totalSize / pageSize) + 1;
		}
	}

	@Override
	public String toString() {
		return "Page [totalSize=" + totalSize + ", pageSize=" + pageSize + ", currentPage=" + currentPage + ", glist="
				+ glist + "]";
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<Goods> getGlist() {
		return glist;
	}

	public void setGlist(List<Goods> glist) {
		this.glist = glist;
	}

}