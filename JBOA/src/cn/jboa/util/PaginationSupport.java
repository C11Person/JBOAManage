package cn.jboa.util;

import java.util.LinkedList;
import java.util.List;

public class PaginationSupport<T>
{
  private int pageSize = 5;

  private int currPageNo = 1;

  private int totalPageCount = 1;

  private int totalCount = 0;

  private List items = new LinkedList();

  public PaginationSupport() {
  }

  public PaginationSupport(int currPageNo, int pageSize) {
    setPageSize(pageSize);
    setCurrPageNo(currPageNo);
  }

  public int getStartRow()
  {
    return (this.currPageNo - 1) * this.pageSize;
  }

  public int getEndRow()
  {
    return this.currPageNo * this.pageSize;
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getCurrPageNo() {
    return this.currPageNo;
  }

  public void setCurrPageNo(int currPageNo) {
    this.currPageNo = currPageNo;
  }

  public int getTotalPageCount() {
    return this.totalPageCount;
  }

  public void setTotalPageCount(int totalPageCount) {
    this.totalPageCount = totalPageCount;
  }

  public int getTotalCount() {
    return this.totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
    if (totalCount >= 0) {
      int count = totalCount / this.pageSize;
      if (totalCount % this.pageSize > 0) {
        count++;
      }
      this.totalPageCount = count;
    }
  }

  public List getItems()
  {
    return this.items;
  }
  public void setItems(List items) {
    this.items = items;
  }
}