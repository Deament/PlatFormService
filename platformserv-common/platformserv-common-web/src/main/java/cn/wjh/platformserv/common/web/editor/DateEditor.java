package cn.wjh.platformserv.common.web.editor;


import java.beans.PropertyEditorSupport;

import cn.wjh.platformserv.common.utils.DateHelper;

/**
 * @author michaelfreeman
 */
public class DateEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) {
        setValue(DateHelper.parseDate(text));
    }

}
