package com.shop4j.cloud.common.database.util;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageSerializable;
import com.shop4j.cloud.common.database.dto.PageDTO;
import com.shop4j.cloud.common.database.vo.PageVO;

/**
 * @author ksying
 * @date 2023/3/12 15:20
 */
public class PageUtils {
    /**
     * 使用pagehelper进行分页，该分页只能一对一
     */
    public static <T> PageVO<T> doPage(PageDTO pageDTO, ISelect select) {

        PageSerializable<T> simplePageInfo = PageHelper.startPage(pageDTO).doSelectPageSerializable(select);

        PageVO<T> pageVO = new PageVO<>();
        pageVO.setList(simplePageInfo.getList());
        pageVO.setTotal(simplePageInfo.getTotal());
        pageVO.setPages(getPages(simplePageInfo.getTotal(), pageDTO.getPageSize()));
        return pageVO;
    }



    public static Integer getPages(long total, Integer pageSize) {

        if (total == -1) {
            return 1;
        }
        if (pageSize > 0) {
            return  (int) (total / pageSize + ((total % pageSize == 0) ? 0 : 1));
        }
        return  0;
    }
}
