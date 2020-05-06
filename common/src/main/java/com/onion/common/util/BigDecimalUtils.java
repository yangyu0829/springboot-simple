package com.onion.common.util;

import java.math.BigDecimal;

/**
 * @author:yu
 * @date:2019-08-22 15:05
 */
public class BigDecimalUtils {

    /**
     * 除法向下取整
     *
     * @param dividend 被除数
     * @param divisor  除数
     * @return 取整后
     */
    public static BigDecimal floorDivide(BigDecimal dividend, BigDecimal divisor) {

        return dividend.abs().divide(divisor.abs(), 0, BigDecimal.ROUND_DOWN);
    }

    /**
     * 除法取余
     *
     * @param dividend 被除数
     * @param divisor  除数
     * @return 余数
     */
    public static BigDecimal modDivide(BigDecimal dividend, BigDecimal divisor) {

        return dividend.abs().divideAndRemainder(divisor.abs())[1];
    }

    /**
     * bigdecimal 比较数值value是否相等
     *
     * @param oldValue
     * @param newValue
     * @return true:false
     */
    public static Boolean equals(BigDecimal oldValue, BigDecimal newValue) {
        if (oldValue == null || newValue == null) {
            return false;
        }

        return oldValue.compareTo(newValue) == 0;
    }

    public static boolean isLessThanZero(BigDecimal value) {
        return value.compareTo(BigDecimal.ZERO) < 0;
    }

    public static boolean isGreaterThanOne(BigDecimal value) {
        return value.compareTo(BigDecimal.ONE) > 0;
    }
}
