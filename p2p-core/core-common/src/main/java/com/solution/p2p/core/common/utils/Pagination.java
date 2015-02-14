package com.solution.p2p.core.common.utils;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-3
 * Time: 下午3:41
 * To change this template use File | Settings | File Templates.
 */
public class Pagination<E> {
    public static final int PAGESIZE = 15;
    public static final int ELLIPSE_QUANTITY = 3;
    public static final int ENTRIES_QUANTITY = 5;
    public static final int HEAD_QUANTITY = 2;
    public static final int TAIL_QUANTITY = 2;
    private int page = 1;
    private int pagesize = 15;
    private int offset = 0;
    private int previousPage = 1;
    private int nextPage = 1;
    private int totalPages = 1;
    private int ellipseQuantity = 3;
    private int entriesQuantity = 5;
    private int headQuantity = 2;
    private int tailQuantity = 2;
    private int startPage = 1;
    private int endPage = 1;
    private int totalRecords = 0;
    private List<E> data;

    public Pagination()
    {
    }

    public Pagination(int page, int pagesize)
    {
    }

    public Pagination(int page, int pagesize, int totalRecords)
    {
        setPagesize(pagesize);
        setTotalRecord(totalRecords);
        setPage(page);
    }

    public Pagination(int page, int pagesize, int totalRecords, int ellipseQuantity) {
        this(page, pagesize, totalRecords);
        setEllipseQuantity(ellipseQuantity);
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = ((this.totalPages > 1) && (page > this.totalPages) ? this.totalPages : page < 1 ? 1 : page);

        parseStartPageAndEndPage();

        if (page > 1)
            setOffset((this.page - 1) * getPagesize());
    }

    public int getPagesize()
    {
        return this.pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = (pagesize < 1 ? 15 : pagesize);

        if (this.page > 1)
            setOffset((this.page - 1) * this.pagesize);
    }

    public int getOffset()
    {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = (offset < 0 ? 0 : offset);
    }

    public int getRange() {
        return this.pagesize;
    }

    public void setRange(int range) {
        setPagesize(range);
    }

    public int getPreviousPage() {
        return this.previousPage;
    }

    public void setPreviousPage(int previousPage) {
        this.previousPage = (this.page <= 1 ? 1 : previousPage);
    }

    public int getNextPage() {
        return this.nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = (this.totalPages >= this.page ? this.page : nextPage);
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = (totalPages < 1 ? 1 : totalPages);
        parseStartPageAndEndPage();
    }

    public int getEllipseQuantity() {
        return this.ellipseQuantity;
    }

    public void setEllipseQuantity(int ellipseQuantity) {
        this.ellipseQuantity = (ellipseQuantity < 0 ? 0 : ellipseQuantity);
    }

    public int getEntriesQuantity() {
        return this.entriesQuantity;
    }

    public void setEntriesQuantity(int entriesQuantity) {
        this.entriesQuantity = (entriesQuantity < 1 ? 5 : entriesQuantity);
    }

    public int getHeadQuantity() {
        return this.headQuantity;
    }

    public void setHeadQuantity(int headQuantity) {
        this.headQuantity = (headQuantity < 1 ? 2 : headQuantity);
    }

    public int getTailQuantity() {
        return this.tailQuantity;
    }

    public void setTailQuantity(int tailQuantity) {
        this.tailQuantity = (tailQuantity < 1 ? 2 : tailQuantity);
    }

    public int getStartPage() {
        return this.startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return this.endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getTotalRecords() {
        return this.totalRecords;
    }

    public void setTotalRecord(int totalRecords) {
        this.totalRecords = (totalRecords < 0 ? 0 : totalRecords);
        setTotalPages((int)Math.ceil(this.totalRecords / this.pagesize));
        setPreviousPage(this.page - 1);
        setNextPage(this.page + 1);
    }

    public List<E> getData() {
        return this.data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }

    private void parseStartPageAndEndPage() {
        if (this.entriesQuantity > this.totalPages) {
            this.entriesQuantity = this.totalPages;
        }

        if (this.page < this.entriesQuantity) {
            this.startPage = 1;
            this.endPage = this.entriesQuantity;
        } else if (this.page > this.totalPages - this.entriesQuantity) {
            this.startPage = (this.totalPages - this.entriesQuantity - 1);
            this.endPage = this.totalPages;
        } else {
            int i = (int)Math.ceil(this.entriesQuantity / 2);

            this.startPage = (this.page - i);
            this.endPage = (this.page + i);
        }
    }
}
