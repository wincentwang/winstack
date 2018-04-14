package wang.wincent.winstack.winapp.common.validator;

import org.apache.commons.lang.StringUtils;
import wang.wincent.winstack.winapp.common.exception.WinException;

/**
 * 数据校验

 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new WinException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new WinException(message);
        }
    }
}
