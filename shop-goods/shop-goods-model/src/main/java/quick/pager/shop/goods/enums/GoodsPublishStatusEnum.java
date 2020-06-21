package quick.pager.shop.goods.enums;

import quick.pager.shop.enums.IEnum;

/**
 * 商品状态
 *
 * @author siguiyang
 */
public enum GoodsPublishStatusEnum implements IEnum<Integer> {

    NONE_SHELF(0, "上架申请"),
    REFUSE(1, "拒绝申请"),
    UPPER_SHELF(2, "上架"),
    LOWER_SHELF(3, "下架");

    private Integer code;

    private String desc;

    GoodsPublishStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    public static GoodsPublishStatusEnum parse(int code) {
        for (GoodsPublishStatusEnum statusEnum : GoodsPublishStatusEnum.values()) {
            if (statusEnum.code == code) {
                return statusEnum;
            }
        }
        return null;
    }
}
